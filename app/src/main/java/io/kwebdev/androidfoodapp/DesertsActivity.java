package io.kwebdev.androidfoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DesertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deserts);

        ListView dessertsList = findViewById(R.id.list_view_desserts);

        Dish[] dishes = {
                new Dish("Île Flottante", "Île flottante or floating island is a popular dessert originating from France, consisting of meringues that are poached in vanilla custard and often topped with caramel sauce and toasted almonds. The meringues are usually made from whipped egg whites, sugar, and vanilla extract.", 1299),
                new Dish("Parfait", "Parfait is a frozen dessert made from a base of egg yolks, sugar, and whipped cream, and it can be flavored with any number of additional ingredients such as fruit, nuts, or coffee.", 999),
                new Dish("Affogato", "The authentic affogato combines two Italian classics: a shot of freshly brewed espresso and a scoop of vanilla or fior di latte gelato. Affogato translates as drowned, referring to the preparation process in which steaming espresso is generously poured over a scoop of gelato.", 1499),
                new Dish("Kheer", "Kheer or payasam is an ancient Indian dessert, a creamy rice pudding that is made in several versions across the country. It is a common dish at numerous Indian ceremonies, festivals, and celebrations, although it can be consumed any time of year.", 1299),
                new Dish("Macaroons", "Macaroons are traditional small cookies originating from Italy. They're usually made from granulated sugar, egg whites, chopped almonds or almond paste, and shredded coconut, while flavorings such as vanilla, spices, and honey are sometimes also added to the mix.", 1199),
                new Dish("Gelato Cioccolato", "Cioccolato is a variety of Italian gelato that is prepared with chocolate and cocoa powder as the key ingredients alongside cream, sugar, and milk. The final product, if made properly and churned at low speed, should have a dense and velvety texture, and a rich, dark brown color.", 1299),
                new Dish("Bread Pudding", "Bread pudding is an old dish that has been prepared since Medieval times in Europe and the Middle East. However, it is extremely beloved and defining in the cuisine of New Orleans. The dish consists of stale bread that is bathed in a combination of milk, sugar, eggs, nuts, and fruits, and is then baked into a delicious dessert.", 1599),
                new Dish("Tulumba", "Turkish tulumba is a hot water dough fritter traditionally found in the cuisines of the former Ottoman Empire, particularly throughout the Middle East and the Balkans.", 1699),
                new Dish("Molten Chocolate Cake", "Chocolate cake filled with special chocolate filling", 1499),
                    };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        dessertsList.setAdapter(dishesAdapter);
    }
}