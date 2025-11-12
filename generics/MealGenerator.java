interface MealPlan { String getPlan(); }
class VegetarianMeal implements MealPlan { public String getPlan(){ return "Vegetarian"; } }
class VeganMeal implements MealPlan { public String getPlan(){ return "Vegan"; } }

class Meal<T extends MealPlan> {
    private T plan;
    Meal(T plan){ this.plan = plan; }
    public void showPlan(){ System.out.println("Meal Plan: " + plan.getPlan()); }
}

class MealGenerator {
    public static <T extends MealPlan> void generateMealPlan(T meal) {
        System.out.println("Generated: " + meal.getPlan());
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> veg = new Meal<>(new VegetarianMeal());
        veg.showPlan();
        generateMealPlan(new VeganMeal());
    }
}
