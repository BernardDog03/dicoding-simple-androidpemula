package com.example.dicoding;

import java.util.ArrayList;

public class FoodData {
    private static String[] foodName = {
            "Baked Stuffed Jumbo Shrimp",
            "American Chop Suey Gasserole",
            "Black-Eyed, Beef & Collard Greens",
            "Polish-American Breakfast Skillet",
            "Meatballs With Beef And Sausage",
            "Tater Tot Hot-dish",
            "Oven-Fried Sand-dab With Summer Salad",
            "Stuffed Peppers With Ground Beef And Rice",
            "Stuffed Cabbage Rolls With Ground Beef and Rice",
            "Fresh Tomato Pasta With Basil",
            "Polish-American Pan Pierogi",
            "Roasted Boneless Beef Loin"
    };
    private static String[] foodDetails ={
            "Baked stuffed shrimp is a classic American dish. This dish use jumbo shrimp. The filling is made of breadcrumbs seasoned with garlic, lemon juice, and parsley.",
            "This casserole combines familiar, comforting american chop suey with a melty cheese topping. This is a delicious way to enjoy classic American comfort fodd, and it can even be prepared a day in advance.",
            "This is a strong one-pot dinner and a favorite in South America. Serve with some soft biscuits and mashed potato for a true southern style party.",
            "This polish breakfast skillet but change with american style. This dish use noodles, sausage and potatoes fried with onion and eggs.",
            "These italian-seasoned meatballs are made with two ground beef and one part italian sausage, minced garlic, dried basil, and grated parmesan cheese flavor.",
            "Tater Tot Hot-dish is a nothern midwest dish. this dish has classic base with a spicy kick but it's creamy, salty, and crunchy.",
            "This dish cooked in oil, this fish were smeared with mayonnaise before being rolled in breadcrumbs. Serve with chunky tomato salad, summer, avocado, sweet corn, and sweet frid onion.",
            "Stuffed bell papers served with a tossed salad and mashed potatoes. The filling include ground beef and rice.",
            "These cabbage rolls are filled with beef and rice and are perfectly roasted with a sharp tomato sauce.",
            "Fresh tomato pasta with basil is best made in the summertime with the freshest tomatoes and basil.",
            "pan pierogi made by wrapping unleavened dough with filling include potato, sauerkraut, ground meat, cheese, and fruits.",
            "Roasted beef loin has a slightly salty typical taste from the former grill and deliciously spicy"
    };
    private static int[] foodImages = {
            R.drawable.am5,
            R.drawable.am2,
            R.drawable.am3,
            R.drawable.am4,
            R.drawable.am9,
            R.drawable.am6,
            R.drawable.am7,
            R.drawable.am8,
            R.drawable.am11,
            R.drawable.am10,
            R.drawable.am1,
            R.drawable.am12
    };

    static ArrayList<Food> getListData() {
        ArrayList<Food> list = new ArrayList<>();
        for (int position = 0; position < foodName.length; position++) {
            Food food = new Food();
            food.setName(foodName[position]);
            food.setDetail(foodDetails[position]);
            food.setPhoto(foodImages[position]);
            list.add(food);
        }
        return list;
    }
}
