import java.util.*;

/**
 * mod
 * check https://play.picoctf.org/practice?page=1&search=basic-mod1
 * this will decode your encoded text 
 * ex: 202 137 390 235 114 369 198 110 350 396 390 383 225 258 38 291 75 324 401 142 288 397
 */
public class mod {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    System.out.print("Enter a your decimals seperated by space: ");
    String num = input.nextLine(); 
    String[] nums = num.split("\\s+");
    String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
    ArrayList code = new ArrayList<Integer>();
    for (int i = 0; i < nums.length; i++) {
      int decimal = Integer.parseInt(nums[i]);
      int n = decimal%37;
      System.out.print(decimal%37 + " ");
      code.add(n);
    }
    System.out.println();
    for (int index = 0; index < code.size(); index++) {
      System.out.print(base.charAt((int) code.get(index)));
    }
  }
}
