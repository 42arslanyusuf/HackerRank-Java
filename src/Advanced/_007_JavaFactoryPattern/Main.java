package Advanced._007_JavaFactoryPattern;

interface Food {
    public String getType();
}
class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {

    public String getType() {
        return "Someone ordered a Dessert!";
    }
}
class FoodFactory {
    public Food getFood(String order) {
        switch(order){
            case "pizza": return new Pizza();
            case "cake": return new Cake();
            default: return null;
        }


    }//End of getFood method

}//End of factory class
