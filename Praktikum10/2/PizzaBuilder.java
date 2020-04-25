import java.util.TreeSet;
import java.util.Set;

public class PizzaBuilder {
  private int diameter;
  private String crust;
  private Set<String> topping;

  public PizzaBuilder(){
    topping = new TreeSet<String>();
    diameter = 35;
    crust = "Original";
  }

  public PizzaBuilder size(String size){
    if (size.equals("small")){
      diameter = 25;
    } else if (size.equals("medium")){
      diameter = 35;
    } else {
      diameter = 40;
    }
    return this;
  }

  public PizzaBuilder crust(String crust){
    this.crust = crust;
    return this;
  }

  public PizzaBuilder addTopping(String topping){
    if (topping.equals("Meat Lovers")){
      this.topping.add("beef");
      this.topping.add("mozarella");
    } else if (topping.equals("Tuna Melt")){
      this.topping.add("tuna");
      this.topping.add("corn");
      this.topping.add("mozarella");
    } else {
      this.topping.add("pepperoni");
      this.topping.add("beef");
      this.topping.add("mushroom");
      this.topping.add("pineapple");
    }
    return this;
  }

  public Pizza build(){
    Pizza p = new Pizza();
    p.setCrust(crust);
    p.setDiameter(diameter);

    int price = 15 * diameter;
    for (String top: topping){
      p.addToppingIngredient(top);
      price += 10;
    }

    if (crust.equals("Cheesy Bites"))
      price += 10;
    else if (crust.equals("Stuffed"))
      price += 20;
    p.setPrice(price);

    return p;
  }
}