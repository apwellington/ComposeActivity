package com.example.composeactivity.componentes

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeactivity.R
import com.example.composeactivity.model.SuperHero


@Composable
fun SimpleRecycleView() {

    val elements = listOf<String>(
        "Hola",
        "Mundo",
        "Mundial",
        "No le des",
        "Tu numero de telefono",
        "A todo el mundo"
    )
    //todos los recycle view solo reciven items
    LazyColumn{
        item { 
            Text(text = "Header")
        }
        items(elements){
            Text(text = "Este es el elemento numero $it")
        }
        item {
            Text(text = "Footer")
        }
    }
}


@Composable
fun SuperHeroRecyclerView() {
    val context = LocalContext.current
    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp), horizontalAlignment = CenterHorizontally){
        items(getHeroes()){
            ItemHeroe(hero = it){
                Toast.makeText(context, "Heroe ${it.name}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}


@Composable
fun ItemHeroe(hero:SuperHero, onItemSeleted: (SuperHero) -> Unit = {}) {
    Card(
        border = BorderStroke(1.dp, color = Color.LightGray),
        modifier = Modifier.width(200.dp).clickable { onItemSeleted(hero) }
    ) {

        Column {
            Image(painter = painterResource(id = hero.image), contentDescription = "Heroe Avatar", Modifier.fillMaxWidth(), contentScale = ContentScale.Crop)
            Text(text = hero.alias, modifier = Modifier.align(CenterHorizontally))
            Text(text = hero.name, modifier = Modifier.align(CenterHorizontally), fontSize = 12.sp)
            Text(text = hero.publisher, modifier = Modifier.align(Alignment.End).padding(8.dp), fontSize = 10.sp)
        }

    }
}


@Composable
fun SuperHeroGridRecyclerView() {
    val context = LocalContext.current
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        content = {
            items(getHeroes())
            {
                ItemHeroe(hero = it){
                    Toast.makeText(context, "Heroe ${it.name}", Toast.LENGTH_SHORT).show()
                }
            }
        },
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    )
}
fun getHeroes(): List<SuperHero> {
    return listOf<SuperHero>(
        SuperHero("Peter Parker", "Spider Man", "Marvel", R.drawable.spiderman),
        SuperHero("Bruce Wayne", "Batman", "DC", R.drawable.batman),
        SuperHero("Daredevil", "Daredevil", "DC", R.drawable.daredevil),
        SuperHero("Barry Allen", "Flash", "DC", R.drawable.flash),
        SuperHero("Logan", "Wolverine", "Marvel", R.drawable.logan),

        //thor
        SuperHero("Thor", "Thor", "Marvel", R.drawable.thor),
        //green lantern
        SuperHero("Jhon", "Green Lantern", "DC", R.drawable.green_lantern),

        SuperHero("Diana", "Wonder Womman", "DC", R.drawable.wonder_woman),
    )
}