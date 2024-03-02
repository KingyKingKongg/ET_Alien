import java.util.*;
import java.util.stream.Stream;

public class TheBank {

    //Items
    static String north = "N"; String east = "E"; String south = "S"; String west = "W";


    //Welcome
    static void Welcome(){
        System.out.println("\nYou are an alien stuck in a facility" +
                "\nYour goals:\n" +
                "1) Rebuild your ship\n2) Find your CoPilot\n3) Feed yourself\n" +
                "You will need a full belly to go home!\n" +
                "\nItems will be stored in your mouth/stomache" +
                "\n\n**Be care of the dangerous Scientist, Guard Dog and Vortex Hole**" +
                "\nThese characters will send you back to your cage (main screen)\n" +
                "unless you have regained your powers. You regain your powers as you eat!\n\n...Click enter to continue\n\n");
        Scanner welcome = new Scanner(System.in);
        String enter_click = welcome.nextLine();



    }

    static void Food_Power(String[] belly,String[] food,String[] sPower, String[] pocket, String[] ship, String[] ship_the, String[] frnd_stom,int counter){


        Scanner eat_trash = new Scanner(System.in);

        System.out.println("\n\nTo eat Type 'C' to feed CoPilot\nTo throw up items type 'T'\n>>");

        String choice = eat_trash.nextLine(); //input variable

        choice = choice.toUpperCase(); //capitalize input

        if (choice.equals("C")) {

            while (true) {

                System.out.println("\nType'C' to Feed your CoPilot");

                String self_co = eat_trash.nextLine(); //input variable

                self_co = self_co.toUpperCase(); //capitalize input

                if (self_co.equals("C")) {
                    if (ship_the[10].equals("CoPilot") && Arrays.asList(belly).contains("Alien-Jelly")) {

                        for (int g = 0; g < frnd_stom.length; g++)
                            if (frnd_stom[g].equals("")) {
                                frnd_stom[g] = "Yum";
                                for (int p = 0; p < belly.length; p++) {
                                    if (belly[p].equals("Alien-Jelly")) {
                                        belly[p] = "";
                                        counter += 1;

                                        break;
                                    }
                                }
                                break;
                            }

                    } else {
                        System.out.println("You have not saved your CoPilot yet or You don't have Alien Jelly to feed him!");
                    }
                    //do stuff for co pilot, he can only eat Alien Jelly
                    break;

                }
//                else if (self_co.equals("S")) {
//                    while (true) {
//                        int count = 1;
//                        System.out.println("\n\nStomach: " + Arrays.toString(belly) + "\n=====================\nItems in your pockets\n" +
//                                "\nCoPiolot Belly: " + Arrays.toString(frnd_stom) + "\n");
//                        System.out.print("Stomache: " + Arrays.toString(belly) + "\n");
//
//                        for (int pc = 1; pc < pocket.length; pc++) {
//                            System.out.println(count + ") " + pocket[pc]);
//                            count++;
//                        }
//                        int check_numb;
//
//                        System.out.println("Which item do you want to eat?\nChoose 1- 8\nTo go back type B: ");
//                        Scanner eat_choice = new Scanner(System.in);
//                        String choixe_eat = eat_choice.nextLine();
//
//                        if (choixe_eat.equals("b") || choixe_eat.equals("B")) {
//                            break;
//                        } else {
//                            try {
//
//                                check_numb = Integer.parseInt(choixe_eat);
//
//                                if (Arrays.asList(ship).contains(pocket[check_numb])) {
//                                    System.out.println("\nYou cannot eat this item\n");
//                                }
//                                else {
//                                    for (int p = 0; p < belly.length; p++) {
//
//                                        if (belly[p].equals("")) {
//                                            belly[p] = pocket[check_numb];
//                                            pocket[check_numb] = "";
//                                            ;
//                                            count = 1;
//                                            break;
//                                        }
//                                    }
//                                }
//
//                            } catch (NumberFormatException e) {
//                                System.out.println("Please type a number between 1 - 10");
//
//                            }
//                        }
//
//                        if (Arrays.asList(food).contains(belly[1])) {
//                            sPower[0] = "ELECTRIC";
//                        }
//                        if (Arrays.asList(food).contains(belly[3])) {
//                            sPower[1] = "SHAPE-SHIFTING";
//                        }
//                        if (Arrays.asList(food).contains(belly[5])) {
//                            sPower[2] = "TELEPORTATION";
//                        }
//
//
//                    }
//                    break;
//                }
                else {
                    System.out.println("*Invalid Input*");
                }


            }
        }
        else if (choice.equals("T")){
            while (true){
                int count = 1;

                for(int pc = 0; pc < belly.length; pc++){
                    System.out.println(count + ") " + belly[pc]);
                    count++;
                }
                int check_numb;

                System.out.println("Which item do you want to trash?\n**IF YOU TRASH AN ITEM, ITS GONE FOREVER! DONT TRASH AN ITEM YOU MAY NEED FOR THE SHIP**\nChoose 1- 8\nTo go back type B: ");
                Scanner eat_choice = new Scanner(System.in);
                String choixe_eat = eat_choice.nextLine();

                if (choixe_eat.equals("b") || choixe_eat.equals("B")){
                    break;
                }
                else {
                    try {

                        check_numb = Integer.parseInt(choixe_eat);
                        check_numb -= 1;

                        if (belly[check_numb].equals("")){
                            System.out.println("\nNothing to Trash!\n");
                        }
                        else{
                            belly[check_numb] = "";;
                        }



                    }
                    catch (NumberFormatException e) {
                        System.out.println("Please type a number between 1 - 10");

                    }
                }


            }


        }


    }



    static int BadGuy_Check (String[] list_name,String[] bad_boys, String[] powerz){
        int win_lose = 0;
        for (int y = 0; y < 3; y++) {

            if (Arrays.asList(list_name).contains(bad_boys[y])) {

                System.out.println("========================\n**DANGER DANGER**\nTHERE IS A  " + bad_boys[y] + " IN THIS ROOM!");

                switch (bad_boys[y]) {
                    case "Guard-Dog":
                        System.out.println("To Enter this room you must use your ELECTRIC powers to pass\nClick Enter to continue");
                        Scanner welcome = new Scanner(System.in);
                        String enter_click = welcome.nextLine();
                        break;
                    case "Scientist":
                        System.out.println("To Enter this room you must use your SHAPE-SHIFTING powers to pass\nClick Enter to continue");
                        Scanner welcome2 = new Scanner(System.in);
                        String enter_click2 = welcome2.nextLine();
                        break;
                    case "Vortex-Hole":
                        System.out.println("To Enter this room you must use your TELEPORTATION powers to pass\nClick enter to continue");
                        Scanner welcome3 = new Scanner(System.in);
                        String enter_click3 = welcome3.nextLine();
                        break;
                } //switch
                ////if statements for if you win or lose the bad guy return win_lose; value 1 or 0
                /// add powers list, check if they are active or not

                if (bad_boys[y].equals("Guard-Dog")){
                    if (Arrays.asList(powerz).contains("ELECTRIC")){
                        System.out.println("\nYou electrocuted the Guard-Dog!");
                        System.out.println("Click enter to continue...");
                        Scanner welcome2 = new Scanner(System.in);
                        String enter_click2 = welcome2.nextLine();

                        for (int erase = 0; erase < list_name.length; erase++){
                            if (list_name[erase].equals("Guard-Dog")){
                                list_name[erase] = "";
                                break;
                            }
                        }
                        win_lose += 2;


                    }
                    else{
                        System.out.println("\nYou cannot pass the Guard-Dog. Eat more food to regain powers!\nClick enter to continue...");
                        Scanner welcome = new Scanner(System.in);
                        String enter_click = welcome.nextLine();
                        win_lose = 0; //means you did not win and you cant enter the room
                        break;
                    }

                }
                else if (bad_boys[y].equals("Scientist")){
                    if (Arrays.asList(powerz).contains("SHAPE-SHIFTING")){
                        System.out.println("You just shape shifted to disguise yourself from the Scientist!");
                        System.out.println("Click enter to continue...");
                        Scanner welcome2 = new Scanner(System.in);
                        String enter_click2 = welcome2.nextLine();

                        for (int erase = 0; erase < list_name.length; erase++){
                            if (list_name[erase].equals("Scientist")){

                                list_name[erase] = "";
                                break;
                            }
                        }
                        win_lose += 2;


                    }
                    else{
                        System.out.println("You cannot get passed the Scientist. Eat more food to regain powers!\nClick enter to continue...");
                        Scanner welcome = new Scanner(System.in);
                        String enter_click = welcome.nextLine();
                        win_lose = 0;; //means you did not win and you cant enter the room
                        break;
                    }

                }
                else if (bad_boys[y].equals("Vortex-Hole")){
                    if (Arrays.asList(powerz).contains("TELEPORTATION")){
                        System.out.println("You have teleported passed the Vortex-Hole!\nClick enter to continue...");
                        Scanner welcome2 = new Scanner(System.in);
                        String enter_click2 = welcome2.nextLine();

                        for (int erase = 0; erase < list_name.length; erase++){
                            if (list_name[erase].equals("Vortex-Hole")){
                                list_name[erase] = "";
                                break;
                            }
                        }
                        win_lose += 2;


                    }
                    else{
                        System.out.println("You cannot get passed the Vortex-Hole. Eat more food to regain powers!\nClick enter to continue...");
                        Scanner welcome = new Scanner(System.in);
                        String enter_click = welcome.nextLine();
                        win_lose = 0;; //means you did not win and you cant enter the room
                        break;
                    }

                }


            } //if
            else {

                win_lose += 2;

            } //else
             
        } //for loop
        //return win_lose;
        return win_lose;
    }


    //All Rooms, doors, and whats inside
    static void Room_Door(String direction, int RmNum,String[] list_name, String [] item_ship,String[] item_bad, String[] tum,String[] powers, String[] food){
        //Check for bad thing when entering
        //ADD POCKETS ARRAY

        for (int c = 0; c < tum.length; c++){
            System.out.println(tum[c]);
            break;
        }


        //System.out.println(Arrays.deepToString(col_items));

        String message = ("\nStomach items: " + Arrays.toString(tum)+ " " +
                "\nPowers Regained: " + Arrays.toString(powers)+"\n");


        ///////////////////////////////////////////////////////////////////
        if (direction.equals("N")){

            if (RmNum == 1) {
                    System.out.println("\n============================\nRoom N1 "+ message +"" +
                            "============================\nITEMS IN  THIS ROOM\n============================");

                while (true){

                    if (Arrays.asList(food).contains(tum[1]) || Arrays.asList(item_ship).contains(tum[1])) {
                        powers[0] = "ELECTRIC";
                    }
                    if (Arrays.asList(food).contains(tum[3])) {
                        powers[1] = "SHAPE-SHIFTING";
                    }
                    if (Arrays.asList(food).contains(tum[5])) {
                        powers[2] = "TELEPORTATION";
                    }

                    int j = 1; //use for trash items or eat items
                    for (int x = 0; x < 3; x++){
                        System.out.print("\n=========" + j + "): ");
                        System.out.println(list_name[x]);
                        j++;
                    }

//                    System.out.println("\n\n" + Arrays.toString(tum));

                    System.out.println("\n\n"+Arrays.toString(powers) +"\n"+ Arrays.toString(tum));
                    System.out.println("Collect Items (1) or Continue (2): ");
                    Scanner collect = new Scanner(System.in);
                    String optionsChosen = collect.nextLine();

                    if (optionsChosen.equals("1")){ //collect Items
                        List<String> item_bad_list = Arrays.asList(item_bad); //turn arry to list

                        while (true){

                            System.out.println("**Choose 1 (item 1), 2 (item 2), 3 (item3):");
                            Scanner collect2 = new Scanner(System.in);
                            String optionsChosen2 = collect2.nextLine();


                            //checks if item is a bad guy, you cant collect bad guys
                            if (optionsChosen2.equals("1")){
                                if (list_name[0].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[0];
                                            list_name[0] = "";;
                                            break;

                                        }

                                    }

                                }
                                break;

                            }
                            else if (optionsChosen2.equals("2")){
                                if (list_name[1].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[1];
                                            list_name[1] = "";;
                                            break;

                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            else if (optionsChosen2.equals("3")){
                                if (list_name[2].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[2];
                                            list_name[2] = "";;
                                            break;

                                        }


                                    }
                                    break;

                                }
                                break;
                            }
                            else{
                                System.out.println("*Invalid Input*");
                            }

                        }


                    }

                    else if (optionsChosen.equals("2")){
                        break;
                    }

                }


            }
            else if (RmNum == 2) {
                System.out.println("\n============================\nRoom N2 " + message + 
                        "============================\nITEMS IN  THIS ROOM\n============================");

                while (true){

                    if (Arrays.asList(food).contains(tum[1]) || Arrays.asList(item_ship).contains(tum[1])) {
                        powers[0] = "ELECTRIC";
                    }
                    if (Arrays.asList(food).contains(tum[3])) {
                        powers[1] = "SHAPE-SHIFTING";
                    }
                    if (Arrays.asList(food).contains(tum[5])) {
                        powers[2] = "TELEPORTATION";
                    }

                    int j = 1; //use for trash items or eat items
                    for (int x = 0; x < 3; x++){
                        System.out.print("\n=========="+j + "): ");
                        System.out.println(list_name[x]);
                        j++;
                    }

                    System.out.println("\n\n"+Arrays.toString(powers) +"\n"+ Arrays.toString(tum));

                    System.out.println("Collect Items (1) or Continue (2): ");
                    Scanner collect = new Scanner(System.in);
                    String optionsChosen = collect.nextLine();

                    if (optionsChosen.equals("1")){ //collect Items
                        List<String> item_bad_list = Arrays.asList(item_bad); //turn arry to list

                        while (true){
                            System.out.println("**Choose 1 (item 1), 2 (item 2), 3 (item3)");
                            Scanner collect2 = new Scanner(System.in);
                            String optionsChosen2 = collect2.nextLine();


                            //checks if item is a bad guy, you cant collect bad guys
                            if (optionsChosen2.equals("1")){
                                if (list_name[0].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[0];
                                            list_name[0] = "";;
                                            break;

                                        }

                                        


                                    }


                                }
                                break;

                            }
                            else if (optionsChosen2.equals("2")){
                                if (list_name[1].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[1];
                                            list_name[1] = "";;
                                            break;

                                        }



                                    }
                                    break;

                                }
                                break;
                            }
                            else if (optionsChosen2.equals("3")){
                                if (list_name[2].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[2];
                                            list_name[2] = "";;
                                            break;

                                        }

                                        

                                    }
                                    break;

                                }
                                break;
                            }
                            else if (optionsChosen2.equals("a") || optionsChosen2.equals("A")){

                                System.out.println("\n\nEaster Egg? Dont click that button again :D\n\n");


                            }

                        }

                    }

                    else if (optionsChosen.equals("2")){
                        break;
                    }

                }

            }
            else if (RmNum == 3) {
                System.out.println("\n============================\nRoom N3 " + message + 
                        "============================\nITEMS IN  THIS ROOM\n============================");

                while (true){

                    if (Arrays.asList(food).contains(tum[1])|| Arrays.asList(item_ship).contains(tum[1])) {
                        powers[0] = "ELECTRIC";
                    }
                    if (Arrays.asList(food).contains(tum[3])) {
                        powers[1] = "SHAPE-SHIFTING";
                    }
                    if (Arrays.asList(food).contains(tum[5])) {
                        powers[2] = "TELEPORTATION";
                    }

                    int j = 1; //use for trash items or eat items
                    for (int x = 0; x < 3; x++){
                        System.out.print("\n==========" +j + "): ");
                        System.out.println(list_name[x]);
                        j++;
                    }

                    System.out.println("\n\n"+Arrays.toString(powers) +"\n"+ Arrays.toString(tum));

                    System.out.println("Collect Items (1) or Continue (2): ");
                    Scanner collect = new Scanner(System.in);
                    String optionsChosen = collect.nextLine();

                    if (optionsChosen.equals("1")){ //collect Items
                        List<String> item_bad_list = Arrays.asList(item_bad); //turn arry to list

                        while (true){
                            System.out.println("**Choose 1 (item 1), 2 (item 2), 3 (item3),:");
                            Scanner collect2 = new Scanner(System.in);
                            String optionsChosen2 = collect2.nextLine();


                            //checks if item is a bad guy, you cant collect bad guys
                            if (optionsChosen2.equals("1")){
                                if (list_name[0].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[0];
                                            list_name[0] = "";;
                                            break;

                                        }

                                        


                                    }


                                }
                                break;

                            }
                            else if (optionsChosen2.equals("2")){
                                if (list_name[1].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[1];
                                            list_name[1] = "";;
                                            break;

                                        }



                                    }
                                    break;

                                }
                                break;
                            }
                            else if (optionsChosen2.equals("3")){
                                if (list_name[2].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[2];
                                            list_name[2] = "";;
                                            break;

                                        }

                                        

                                    }
                                    break;

                                }
                                break;
                            }


                        }

                    }

                    else if (optionsChosen.equals("2")){
                        break;
                    }

                }

            }

        }

        else if (direction.equals("E")){


            if (RmNum == 1) {
                System.out.println("\n============================\nRoom E1 " + message +
                        "============================\nITEMS IN  THIS ROOM\n============================");


                while (true){

                    if (Arrays.asList(food).contains(tum[1]) || Arrays.asList(item_ship).contains(tum[1])) {
                        powers[0] = "ELECTRIC";
                    }
                    if (Arrays.asList(food).contains(tum[3])) {
                        powers[1] = "SHAPE-SHIFTING";
                    }
                    if (Arrays.asList(food).contains(tum[5])) {
                        powers[2] = "TELEPORTATION";
                    }

                    int j = 1; //use for trash items or eat items
                    for (int x = 0; x < 3; x++){
                        System.out.print("\n==========" +j + "): ");
                        System.out.println(list_name[x]);
                        j++;
                    }

                    System.out.println("\n\n"+Arrays.toString(powers) +"\n"+ Arrays.toString(tum));

                    System.out.println("Collect Items (1) or Continue (2): ");
                    Scanner collect = new Scanner(System.in);
                    String optionsChosen = collect.nextLine();

                    if (optionsChosen.equals("1")){ //collect Items
                        List<String> item_bad_list = Arrays.asList(item_bad); //turn arry to list

                        while (true){


                            System.out.println("**Choose 1 (item 1), 2 (item 2), 3 (item3):");
                            Scanner collect2 = new Scanner(System.in);
                            String optionsChosen2 = collect2.nextLine();


                            //checks if item is a bad guy, you cant collect bad guys
                            if (optionsChosen2.equals("1")){
                                if (list_name[0].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[0];
                                            list_name[0] = "";;
                                            break;

                                        }

                                        


                                    }


                                }
                                break;

                            }
                            else if (optionsChosen2.equals("2")){
                                if (list_name[1].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[1];
                                            list_name[1] = "";;
                                            break;

                                        }



                                    }
                                    break;

                                }
                                break;
                            }
                            else if (optionsChosen2.equals("3")){
                                if (list_name[2].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[2];
                                            list_name[2] = "";;
                                            break;

                                        }

                                        

                                    }
                                    break;

                                }
                                break;
                            }


                        }



                    }

                    else if (optionsChosen.equals("2")){
                        break;
                    }

                }


            }
            else if (RmNum == 2) {
                System.out.println("\n============================\nRoom E2"+ message +
                        "============================\nITEMS IN  THIS ROOM\n============================");
//                int j = 1; //use for trash items or eat items


                while (true){

                    if (Arrays.asList(food).contains(tum[1]) || Arrays.asList(item_ship).contains(tum[1])) {
                        powers[0] = "ELECTRIC";
                    }
                    if (Arrays.asList(food).contains(tum[3])) {
                        powers[1] = "SHAPE-SHIFTING";
                    }
                    if (Arrays.asList(food).contains(tum[5])) {
                        powers[2] = "TELEPORTATION";
                    }

                    int jE2 = 1; //use for trash items or eat items
                    for (int x = 0; x < 3; x++){
                        System.out.print("\n==========" +jE2 + "): ");
                        System.out.println(list_name[x]);
                        jE2++;
                    }

                    System.out.println("\n\n"+Arrays.toString(powers) +"\n"+ Arrays.toString(tum));

                    System.out.println("Collect Items (1) or Continue (2): ");
                    Scanner collect = new Scanner(System.in);
                    String optionsChosen = collect.nextLine();

                    if (optionsChosen.equals("1")){ //collect Items
                        List<String> item_bad_list = Arrays.asList(item_bad); //turn arry to list

                        while (true){

                            System.out.println("**Choose 1 (item 1), 2 (item 2), 3 (item3):");
                            Scanner collect2 = new Scanner(System.in);
                            String optionsChosen2 = collect2.nextLine();


                            //checks if item is a bad guy, you cant collect bad guys
                            if (optionsChosen2.equals("1")){
                                if (list_name[0].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[0];
                                            list_name[0] = "";;
                                            break;

                                        }

                                        


                                    }


                                }
                                break;

                            }
                            else if (optionsChosen2.equals("2")){
                                if (list_name[1].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[1];
                                            list_name[1] = "";;
                                            break;

                                        }



                                    }
                                    break;

                                }
                                break;
                            }
                            else if (optionsChosen2.equals("3")){
                                if (list_name[2].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[2];
                                            list_name[2] = "";;
                                            break;

                                        }

                                        

                                    }
                                    break;

                                }
                                break;
                            }


                        }



                    }

                    else if (optionsChosen.equals("2")){
                        break;
                    }

                }

            }
            else if (RmNum == 3) {
                System.out.println("\n============================\nRoom E3"+ message +
                        "============================\nITEMS IN  THIS ROOM\n============================");
//                int j = 1; //use for trash items or eat items

                while (true){

                    if (Arrays.asList(food).contains(tum[1]) || Arrays.asList(item_ship).contains(tum[1])) {
                        powers[0] = "ELECTRIC";
                    }
                    if (Arrays.asList(food).contains(tum[3])) {
                        powers[1] = "SHAPE-SHIFTING";
                    }
                    if (Arrays.asList(food).contains(tum[5])) {
                        powers[2] = "TELEPORTATION";
                    }

                    int jE3 = 1; //use for trash items or eat items
                    for (int x = 0; x < 3; x++){
                        System.out.print("\n=========="+jE3 + "): ");
                        System.out.println(list_name[x]);
                        jE3++;
                    }

                    System.out.println("\n\n"+Arrays.toString(powers) +"\n"+ Arrays.toString(tum));

                    System.out.println("Collect Items (1) or Continue (2): ");
                    Scanner collect = new Scanner(System.in);
                    String optionsChosen = collect.nextLine();

                    if (optionsChosen.equals("1")){ //collect Items
                        List<String> item_bad_list = Arrays.asList(item_bad); //turn arry to list

                        while (true){

                            System.out.println("**Choose 1 (item 1), 2 (item 2), 3 (item3):");
                            Scanner collect2 = new Scanner(System.in);
                            String optionsChosen2 = collect2.nextLine();


                            //checks if item is a bad guy, you cant collect bad guys
                            if (optionsChosen2.equals("1")){
                                if (list_name[0].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[0];
                                            list_name[0] = "";;
                                            break;

                                        }

                                        


                                    }


                                }
                                break;

                            }
                            else if (optionsChosen2.equals("2")){
                                if (list_name[1].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[1];
                                            list_name[1] = "";;
                                            break;

                                        }



                                    }
                                    break;

                                }
                                break;
                            }
                            else if (optionsChosen2.equals("3")){
                                if (list_name[2].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[2];
                                            list_name[2] = "";;
                                            break;

                                        }

                                        

                                    }
                                    break;

                                }
                                break;
                            }


                        }



                    }

                    else if (optionsChosen.equals("2")){
                        break;
                    }

                }

            }

        }
        else if (direction.equals("S")){


            if (RmNum == 1) {
                System.out.println("\n============================\nRoom S1"+ message +
                        "============================\nITEMS IN  THIS ROOM\n============================");
                int j = 1; //use for trash items or eat items

                while (true){

                    if (Arrays.asList(food).contains(tum[1]) || Arrays.asList(item_ship).contains(tum[1])) {
                        powers[0] = "ELECTRIC";
                    }
                    if (Arrays.asList(food).contains(tum[3])) {
                        powers[1] = "SHAPE-SHIFTING";
                    }
                    if (Arrays.asList(food).contains(tum[5])) {
                        powers[2] = "TELEPORTATION";
                    }

                    int jS1 = 1; //use for trash items or eat items
                    for (int x = 0; x < 3; x++){
                        System.out.print(jS1 + "): ");
                        System.out.println(list_name[x]);
                        jS1++;
                    }

                    System.out.println("\n\n"+Arrays.toString(powers) +"\n"+ Arrays.toString(tum));

                    System.out.println("Collect Items (1) or Continue (2): ");
                    Scanner collect = new Scanner(System.in);
                    String optionsChosen = collect.nextLine();

                    if (optionsChosen.equals("1")){ //collect Items
                        List<String> item_bad_list = Arrays.asList(item_bad); //turn arry to list

                        while (true){

                            System.out.println("**Choose 1 (item 1), 2 (item 2), 3 (item3):");
                            Scanner collect2 = new Scanner(System.in);
                            String optionsChosen2 = collect2.nextLine();


                            //checks if item is a bad guy, you cant collect bad guys
                            if (optionsChosen2.equals("1")){
                                if (list_name[0].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[0];
                                            list_name[0] = "";;
                                            break;

                                        }

                                        


                                    }


                                }
                                break;

                            }
                            else if (optionsChosen2.equals("2")){
                                if (list_name[1].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[1];
                                            list_name[1] = "";;
                                            break;

                                        }

                                    }
                                    break;

                                }
                                break;
                            }
                            else if (optionsChosen2.equals("3")){
                                if (list_name[2].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[2];
                                            list_name[2] = "";;
                                            break;

                                        }

                                        

                                    }
                                    break;

                                }
                                break;
                            }


                        }



                    }

                    else if (optionsChosen.equals("2")){
                        break;
                    }

                }


            }
            else if (RmNum == 2) {
                System.out.println("\n============================\nRoom S2"+ message +
                        "============================\nITEMS IN  THIS ROOM\n============================");
//                int j = 1; //use for trash items or eat items

                while (true){

                    if (Arrays.asList(food).contains(tum[1]) || Arrays.asList(item_ship).contains(tum[1])) {
                        powers[0] = "ELECTRIC";
                    }
                    if (Arrays.asList(food).contains(tum[3])) {
                        powers[1] = "SHAPE-SHIFTING";
                    }
                    if (Arrays.asList(food).contains(tum[5])) {
                        powers[2] = "TELEPORTATION";
                    }

                    int jS2 = 1; //use for trash items or eat items
                    for (int x = 0; x < 3; x++){
                        System.out.print("\n=========="+jS2 + "): ");
                        System.out.println(list_name[x]);
                        jS2++;
                    }

                    System.out.println("\n\n"+Arrays.toString(powers) +"\n"+ Arrays.toString(tum));

                    System.out.println("Collect Items (1) or Continue (2): ");
                    Scanner collect = new Scanner(System.in);
                    String optionsChosen = collect.nextLine();

                    if (optionsChosen.equals("1")){ //collect Items
                        List<String> item_bad_list = Arrays.asList(item_bad); //turn arry to list

                        while (true){

                            System.out.println("**Choose 1 (item 1), 2 (item 2), 3 (item3):");
                            Scanner collect2 = new Scanner(System.in);
                            String optionsChosen2 = collect2.nextLine();


                            //checks if item is a bad guy, you cant collect bad guys
                            if (optionsChosen2.equals("1")){
                                if (list_name[0].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[0];
                                            list_name[0] = "";;
                                            break;

                                        }

                                        


                                    }


                                }
                                break;

                            }
                            else if (optionsChosen2.equals("2")){
                                if (list_name[1].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[1];
                                            list_name[1] = "";;
                                            break;

                                        }


                                    }
                                    break;

                                }
                                break;
                            }
                            else if (optionsChosen2.equals("3")){
                                if (list_name[2].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[2];
                                            list_name[2] = "";;
                                            break;

                                        }

                                        

                                    }
                                    break;

                                }
                                break;
                            }


                        }



                    }

                    else if (optionsChosen.equals("2")){
                        break;
                    }

                }

            }
            else if (RmNum == 3) {
                System.out.println("\n============================\nRoom S3"+ message +
                        "============================\nITEMS IN  THIS ROOM\n============================");
                
                while (true){

                    if (Arrays.asList(food).contains(tum[1]) || Arrays.asList(item_ship).contains(tum[1])) {
                        powers[0] = "ELECTRIC";
                    }
                    if (Arrays.asList(food).contains(tum[3])) {
                        powers[1] = "SHAPE-SHIFTING";
                    }
                    if (Arrays.asList(food).contains(tum[5])) {
                        powers[2] = "TELEPORTATION";
                    }

                    int jS3 = 1; //use for trash items or eat items
                    for (int x = 0; x < 3; x++){
                        System.out.print("\n==========" +jS3 + "): ");
                        System.out.println(list_name[x]);
                        jS3++;
                    }

                    System.out.println("\n\n"+Arrays.toString(powers) +"\n"+ Arrays.toString(tum));
                    System.out.println("Collect Items (1) or Continue (2): ");
                    Scanner collect = new Scanner(System.in);
                    String optionsChosen = collect.nextLine();

                    if (optionsChosen.equals("1")){ //collect Items
                        List<String> item_bad_list = Arrays.asList(item_bad); //turn arry to list

                        while (true){

                            System.out.println("**Choose 1 (item 1), 2 (item 2), 3 (item3):");
                            Scanner collect2 = new Scanner(System.in);
                            String optionsChosen2 = collect2.nextLine();


                            //checks if item is a bad guy, you cant collect bad guys
                            if (optionsChosen2.equals("1")){
                                if (list_name[0].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[0];
                                            list_name[0] = "";;
                                            break;

                                        }

                                        


                                    }


                                }
                                break;

                            }
                            else if (optionsChosen2.equals("2")){
                                if (list_name[1].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[1];
                                            list_name[1] = "";;
                                            break;

                                        }


                                    }
                                    break;

                                }
                                break;
                            }
                            else if (optionsChosen2.equals("3")){
                                if (list_name[2].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[2];
                                            list_name[2] = "";;
                                            break;

                                        }

                                        

                                    }
                                    break;

                                }
                                break;
                            }


                        }



                    }

                    else if (optionsChosen.equals("2")){
                        break;
                    }

                }

            }

        }
        else if (direction.equals("W")){


            if (RmNum == 1) {
                System.out.println("\n============================\nRoom W1"+ message +
                        "============================\nITEMS IN  THIS ROOM\n============================");
//                || Arrays.asList(item_ship).contains(tum[1])
                while (true){

                    if (Arrays.asList(food).contains(tum[1]) || Arrays.asList(item_ship).contains(tum[1])) {
                        powers[0] = "ELECTRIC";
                    }
                    if (Arrays.asList(food).contains(tum[3])) {
                        powers[1] = "SHAPE-SHIFTING";
                    }
                    if (Arrays.asList(food).contains(tum[5])) {
                        powers[2] = "TELEPORTATION";
                    }

                    int jW1 = 1; //use for trash items or eat items
                    for (int x = 0; x < 3; x++){
                        System.out.print("\n=========="+jW1 + "): ");
                        System.out.println(list_name[x]);
                        jW1++;
                    }

                    System.out.println("\n\n"+Arrays.toString(powers) +"\n"+ Arrays.toString(tum));

                    System.out.println("Collect Items (1) or Continue (2): ");
                    Scanner collect = new Scanner(System.in);
                    String optionsChosen = collect.nextLine();

                    if (optionsChosen.equals("1")){ //collect Items
                        List<String> item_bad_list = Arrays.asList(item_bad); //turn arry to list

                        while (true){

                            System.out.println("**Choose 1 (item 1), 2 (item 2), 3 (item3):");
                            Scanner collect2 = new Scanner(System.in);
                            String optionsChosen2 = collect2.nextLine();


                            //checks if item is a bad guy, you cant collect bad guys
                            if (optionsChosen2.equals("1")){
                                if (list_name[0].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[0];
                                            list_name[0] = "";;
                                            break;

                                        }

                                        


                                    }


                                }
                                break;

                            }
                            else if (optionsChosen2.equals("2")){
                                if (list_name[1].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[1];
                                            list_name[1] = "";;
                                            break;

                                        }


                                    }
                                    break;

                                }
                                break;
                            }
                            else if (optionsChosen2.equals("3")){
                                if (list_name[2].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[2];
                                            list_name[2] = "";;
                                            break;

                                        }

                                        

                                    }
                                    break;

                                }
                                break;
                            }


                        }



                    }

                    else if (optionsChosen.equals("2")){
                        break;
                    }

                }


            }
            else if (RmNum == 2) {
                System.out.println("\n============================\nRoom W2"+ message +
                        "============================\nITEMS IN  THIS ROOM\n============================");

                while (true){

                    if (Arrays.asList(food).contains(tum[1]) || Arrays.asList(item_ship).contains(tum[1])) {
                        powers[0] = "ELECTRIC";
                    }
                    if (Arrays.asList(food).contains(tum[3])) {
                        powers[1] = "SHAPE-SHIFTING";
                    }
                    if (Arrays.asList(food).contains(tum[5])) {
                        powers[2] = "TELEPORTATION";
                    }

                    int jW2 = 1; //use for trash items or eat items
                    for (int x = 0; x < 3; x++){
                        System.out.print("\n=========="+jW2 + "): ");
                        System.out.println(list_name[x]);
                        jW2++;
                    }

                    System.out.println("\n\n"+Arrays.toString(powers) +"\n"+ Arrays.toString(tum));

                    System.out.println("Collect Items (1) or Continue (2): ");
                    Scanner collect = new Scanner(System.in);
                    String optionsChosen = collect.nextLine();

                    if (optionsChosen.equals("1")){ //collect Items
                        List<String> item_bad_list = Arrays.asList(item_bad); //turn arry to list

                        while (true){
                            System.out.println("**Choose 1 (item 1), 2 (item 2), 3 (item3):");
                            Scanner collect2 = new Scanner(System.in);
                            String optionsChosen2 = collect2.nextLine();


                            //checks if item is a bad guy, you cant collect bad guys
                            if (optionsChosen2.equals("1")){
                                if (list_name[0].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[0];
                                            list_name[0] = "";;
                                            break;

                                        }

                                        


                                    }


                                }
                                break;

                            }
                            else if (optionsChosen2.equals("2")){
                                if (list_name[1].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[1];
                                            list_name[1] = "";;
                                            break;

                                        }


                                    }
                                    break;

                                }
                                break;
                            }
                            else if (optionsChosen2.equals("3")){
                                if (list_name[2].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[2];
                                            list_name[2] = "";;
                                            break;

                                        }

                                        

                                    }
                                    break;

                                }
                                break;
                            }


                        }



                    }

                    else if (optionsChosen.equals("2")){
                        break;
                    }

                }

            }
            else if (RmNum == 3) {
                System.out.println("\n============================\nRoom W3"+ message +
                        "============================\nITEMS IN  THIS ROOM\n============================");

                while (true){

                    if (Arrays.asList(food).contains(tum[1]) || Arrays.asList(item_ship).contains(tum[1])) {
                        powers[0] = "ELECTRIC";
                    }
                    if (Arrays.asList(food).contains(tum[3])) {
                        powers[1] = "SHAPE-SHIFTING";
                    }
                    if (Arrays.asList(food).contains(tum[5])) {
                        powers[2] = "TELEPORTATION";
                    }

                    int jW3 = 1; //use for trash items or eat items
                    for (int x = 0; x < 3; x++){
                        System.out.print("\n=========="+jW3 + "): ");
                        System.out.println(list_name[x]);
                        jW3++;
                    }

                    System.out.println("\n\n"+Arrays.toString(powers) +"\n"+ Arrays.toString(tum));

                    System.out.println("Collect Items (1) or Continue (2): ");
                    Scanner collect = new Scanner(System.in);
                    String optionsChosen = collect.nextLine();

                    if (optionsChosen.equals("1")){ //collect Items
                        List<String> item_bad_list = Arrays.asList(item_bad); //turn arry to list

                        while (true){
                            System.out.println("**Choose 1 (item 1), 2 (item 2), 3 (item3):");
                            Scanner collect2 = new Scanner(System.in);
                            String optionsChosen2 = collect2.nextLine();


                            //checks if item is a bad guy, you cant collect bad guys
                            if (optionsChosen2.equals("1")){
                                if (list_name[0].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[0];
                                            list_name[0] = "";;
                                            break;

                                        }

                                        


                                    }


                                }
                                break;

                            }
                            else if (optionsChosen2.equals("2")){
                                if (list_name[1].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[1];
                                            list_name[1] = "";;
                                            break;

                                        }



                                    }
                                    break;

                                }
                                break;
                            }
                            else if (optionsChosen2.equals("3")){
                                if (list_name[2].equals("")){
                                    System.out.println("You cannot collect this item");
                                }
                                else {
                                    for (int p = 0; p < tum.length; p++){
                                        if (tum[p].equals("")){
                                            tum[p] = list_name[2];
                                            list_name[2] = "";;
                                            break;

                                        }

                                        

                                    }
                                    break;

                                }
                                break;
                            }


                        }



                    }

                    else if (optionsChosen.equals("2")){
                        break;
                    }

                }

            }

        }

        

    }

    static void CollectedItems(String[] col_items, String[] tummy, String[] the_power,String[] co_tum,String[] ship_u){

        System.out.print("Stomch items: ");

        System.out.print(Arrays.toString(tummy));
        
        System.out.print("\nPowers Regained: ");

        System.out.print(Arrays.toString(the_power) + "\n");

        System.out.print("\nShip Progress: ");

        System.out.print(Arrays.toString(ship_u) + "\n");

        System.out.print("\nCo Pilot's Stomache: ");

        System.out.print(Arrays.toString(co_tum) + "\n");




    }

    static void CompassPic(){
        String compass = """
                    N
                    ^   \s
                    ^   \s
                    ^   \s
            W < < <   > > >E\s
                    v \s
                    v \s
                    v \s
                    S \s""";

        System.out.println(compass);
    }


    //Items needed in order to win the game
    static int The_Ship(String[] items_stomc, String[] ship_the, String[] item_ship,int ship_count){

        System.out.println("In order to fix the ship you will need\n" +
                "2 Oil Cans -- 2 Metal-Sheets -- 3 Wood-Chips -- 2 Rubber -- 1 Battery -- Copilot" +
                "\nIn order to go home, you need to put you CoPilot on the ship, and feed him (in the kitchen).");

        while (true) {


            System.out.print("The Ship >> " +Arrays.toString(ship_the) );

            System.out.print("\n\nStomache Items: \n");

            int count = 1;
            //pocekt list
            for (int pc = 0; pc < items_stomc.length; pc++) {
                System.out.println(count + ") " + items_stomc[pc]);
                count++;
            }
            int check_numb;

            Scanner eat_trash = new Scanner(System.in);

            System.out.println("Type 1- 8 for Ship Item or type 'B' to go back >>");

            String choice = eat_trash.nextLine(); //input variable


            if (choice.equals("b") || choice.equals("B")) {
                break;
            }
            else {
                try {

                    check_numb = Integer.parseInt(choice);
                    check_numb -= 1;
//                    items_pocket[check_numb] =  "";
                    //"o","o","m","m","w","w","w","b","r","r","co" --- the_ship_fix
//                    {"Oil-Can","Metal-Sheet","Wood-Chips","Battery","Rubber"}; ship = ship_item

                    if (items_stomc[check_numb].equals(item_ship[0])){ //oil

                        for (int pp = 0; pp < ship_the.length; pp++){
                            if (ship_the[pp].equals("o")){
                                ship_the[pp] = items_stomc[check_numb];
                                items_stomc[check_numb] =  "";
                                ship_count += 1;
                                break;
                            }
                        }

                    }
                    else if (items_stomc[check_numb].equals(item_ship[1])){ //metal

                        for (int pp = 0; pp < ship_the.length; pp++){
                            if (ship_the[pp].equals("m")){
                                ship_the[pp] = items_stomc[check_numb];
                                items_stomc[check_numb] =  "";
                                ship_count +=1;
                                break;
                            }
                        }

                    }
                    else if (items_stomc[check_numb].equals(item_ship[3])){ //battery
                        for (int pp = 0; pp < ship_the.length; pp++){
                            if (ship_the[pp].equals("b")){
                                ship_the[pp] = items_stomc[check_numb];
                                items_stomc[check_numb] =  "";
                                ship_count +=1;
                                break;
                            }
                        }

                    }
                    else if (items_stomc[check_numb].equals(item_ship[2])){ //wood
                        for (int pp = 0; pp < ship_the.length; pp++){
                            if (ship_the[pp].equals("w")){
                                ship_the[pp] = items_stomc[check_numb];
                                items_stomc[check_numb] =  "";
                                ship_count +=1;
                                break;
                            }
                        }

                    }
                    else if (items_stomc[check_numb].equals(item_ship[4])){ //rubber
                        for (int pp = 0; pp < ship_the.length; pp++){
                            if (ship_the[pp].equals("r")){
                                ship_the[pp] = items_stomc[check_numb];
                                items_stomc[check_numb] =  "";
                                ship_count +=1;
                                break;
                            }
                        }

                    }
                    else if (items_stomc[check_numb].equals(item_ship[5])){ //copilot
                        for (int pp = 0; pp < ship_the.length; pp++){
                            if (ship_the[pp].equals("co")){
                                ship_the[pp] = items_stomc[check_numb];
                                items_stomc[check_numb] =  "";
                                ship_count +=1;
                                break;
                            }
                        }

                    }
                    else {
                        System.out.println("\nThis is not an item that will fix your ship\n");
                    }





                } catch (NumberFormatException e) {
                    System.out.println("Please type a number between 1 - 8");

                }
            }
        }

        int win = 0;

        if (ship_count ==13){
            System.out.println("\n\nYou can now go home");
            win = 1;
        }
        else{
            win = 0;
        }

        return win;
    }


//PUBLIC STATIC VOID!!=======================================================================MAIN
    public static void main(String[] args){
        // TheBank
        TheBank northDir = new TheBank();
        TheBank eastDir = new TheBank();
        TheBank southDir = new TheBank();
        TheBank westDir = new TheBank();

        /////////////////////////////
        String[] food_item = {"Mars-Rock","Moon-Rock","Pluto-Rock","Orange","Water","Rubber","Alien-Jelly"};
        String[] stomch = {"","","","","","",""};

        String[] ship_item = {"Oil-Can","Metal-Sheet","Wood-Chips","Battery","Rubber","CoPilot"};
        String[] the_ship_fixed = {"o","o","m","m","w","w","w","b","r","r","co"}; //********* 0-10 (11 items)
        int count_ship = 0;

        String[] bad_guys = {"Guard-Dog","Scientist","Vortex-Hole"};
        String[] coPi_eat = {"",""}; //Alien Jelly



        String[] powers = {"","",""};
        String[] pocket = {" ","","","","","","","",""};



        //initiate string
        String items_String = "Oil-Can Oil-Can Metal-Sheet Metal-Sheet Wood-Chips Wood-Chips Wood-Chips " + "Battery Mars-Rock Moon-Rock Pluto-Rock " +"Orange Orange Orange Orange Orange Orange "
                +"Water Water Water Water Water " + "Rubber Rubber Rubber Rubber " + "Alien-Jelly Alien-Jelly " +"Guard-Dog Guard-Dog Guard-Dog Scientist Scientist " + "Vortex-Hole Vortex-Hole CoPilot";

        //create empty list
        String[] all_items = null;

        //Creating new arrays, empty
        String[][] rooms_list = {
                {"","",""},{"","",""},{"","",""},
                {"","",""},{"","",""},{"","",""},
                {"","",""},{"","",""},{"","",""},
                {"","",""},{"","",""},{"","",""},
        };

        //add string items to list
        all_items = items_String.split(" ");

        int f = 0;
        int k = 0;

        while (true){

            //Shuffle the list
            Collections.shuffle(Arrays.asList(all_items));



            //Checks to make sure all four first rooms, no more than 2 in two of the first rooms


            int elem_item = 0;

            for (int wing_array_Count1 = 0; wing_array_Count1 <= 11; wing_array_Count1++) {

                for (int wing_array_Count2 = 0; wing_array_Count2 <= 2; wing_array_Count2++){

                    rooms_list[wing_array_Count1][wing_array_Count2] = (all_items[elem_item]);

                    elem_item++;
                }

            }
            //Checks Bad guys only in 2 rooms
            List<String> bg = Arrays.asList(bad_guys);

            for (int ro = 0; ro < 10; ro+=3) {
                boolean rl_chek_1 = Arrays.asList(bad_guys).contains(rooms_list[ro][0]);
                boolean rl_chek_2 = Arrays.asList(bad_guys).contains(rooms_list[ro][1]);
                boolean rl_chek_3 = Arrays.asList(bad_guys).contains(rooms_list[ro][2]);


                if (rl_chek_1 == true || rl_chek_2 == true || rl_chek_3 == true){
                    f++;///////
                }

            }

            if (f >= 3){
                f = 0;
            }
            else{

                break;
            }


        }

        ///////////////



        Welcome();

        while (true) {

//            System.out.println(count_ship);

            System.out.println("==================\tAlien SHIP ==================");
            CollectedItems(pocket,stomch,powers,coPi_eat,the_ship_fixed);

            System.out.println("==================\nChoose an Action\n1) Move \n2) Feed CoPilot/Throw Up\n3) Build (CoPilot goes Here!) \n4) Go Home \n5) Help\n6) To quit\n\nType 1, 2, 3, or 4\n >> ");
            Scanner shipOpt = new Scanner(System.in);
            String optionsChosen = shipOpt.nextLine();

            if (optionsChosen.equals("1")) {
                while (true) {
                    
                    Scanner userDirInput = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("\nChoose a Direction \nType 'N' for North - 'E' for East - 'S' for South - 'W' for West: "); //input prompt
//                    CompassPic();
                    String dirChosen = userDirInput.nextLine(); //input variable
                    dirChosen = dirChosen.toUpperCase(); //capitalize input

                    if (dirChosen.equals(northDir.north)) {//use .equals() for strings

                        while (true) { //North Room 1
//                            BadGuy_Check(rooms_list[0], bad_guys,powers);

                            if (BadGuy_Check(rooms_list[0], bad_guys,powers) == 0) {
                                
                                break;
                            }
                            else {
                                Room_Door("N",1,rooms_list[0],ship_item,bad_guys,stomch,powers,food_item); //North Room 1

                                Scanner nRoomDir = new Scanner(System.in);

                                System.out.println("\nChoose a Direction \nType 'N' to go to the next room - 'B' Back to ship): ");
                                String nRoomDir1 = nRoomDir.nextLine();
                                nRoomDir1 = nRoomDir1.toUpperCase();

                                if (nRoomDir1.equals("N")) { //North room 2
                                    while (true) {
//                                        BadGuy_Check(rooms_list[1], bad_guys, powers);

                                        if (BadGuy_Check(rooms_list[1], bad_guys,powers) == 0) {
                                            
                                            break;
                                        } else {
                                            Room_Door("N",2,rooms_list[1],ship_item,bad_guys,stomch,powers,food_item);
                                            //Stuff in the room blah blah
                                            Scanner nRoom2Dir = new Scanner(System.in);
                                            System.out.println("\nChoose a Direction \nType 'N' for the next room - 'B' to go back: ");
                                            String nRoom2Dir1 = nRoom2Dir.nextLine();
                                            nRoom2Dir1 = nRoom2Dir1.toUpperCase();

                                            if (nRoom2Dir1.equals("N")) {
//                                                BadGuy_Check(rooms_list[2], bad_guys,powers);

                                                if (BadGuy_Check(rooms_list[2], bad_guys,powers) == 0) {
                                                    
                                                    break;
                                                }
                                                else {
                                                    Room_Door("N",3,rooms_list[2],ship_item,bad_guys,stomch,powers,food_item);

                                                    while (true) {
                                                        Scanner nRoom3Dir = new Scanner(System.in);
                                                        System.out.println("\nType 'B' to go back): ");
                                                        String nRoom3Dir1 = nRoom3Dir.nextLine();
                                                        nRoom3Dir1 = nRoom3Dir1.toUpperCase();

                                                        //checks for letter S
                                                        if (nRoom3Dir1.equals("B")) {

                                                            break;

                                                        }
                                                        else {
                                                            System.out.println("\n\nInvalid Movement");
                                                        }//checks so letter S
                                                    }//loop North room 3 loop
                                                }

                                            } //northern movement

                                            else if (nRoom2Dir1.equals("B")) {
                                                break; //////////////////////////////////leave point. come back
                                            }//if input is S to go back

                                        } // while room two if statement

                                    }
                                }// if statement N to go up
                                else if (nRoomDir1.equals("B")) {
                                    break; //leave north side, back to ship
                                } //leave north side, back to ship
                                else {
                                    System.out.println("\nInvalid Input\n");
                                } //invalid
                            }




                        } //North room N or S while loop

                        break; //leave while loop optionsChosen

                    } //dirChosen.equals NORTH N you went north

                    //////////////////
                    // BELOW IS EAST DIRECTION, EAST WING
                    // /////////////
                    
                    else if (dirChosen.equals(eastDir.east)){
//                        System.out.println("You went East Wing\n");

                        while (true) { //East Room 1
//                            BadGuy_Check(rooms_list[3], bad_guys,powers);

                            if (BadGuy_Check(rooms_list[3], bad_guys,powers) == 0) {
                                
                                break;
                            }
                            else {
                                Room_Door("E",1,rooms_list[3],ship_item,bad_guys,stomch,powers,food_item); //East Room 1
                                //STUFF IN THE ROOM AND/OR CONSEQUENCE

                                Scanner eRoomDir = new Scanner(System.in);
                                System.out.println("\nChoose a Direction \nType 'N' for next room - 'B' to go back (Back to ship): ");
                                String eRoomDir1 = eRoomDir.nextLine();
                                eRoomDir1 = eRoomDir1.toUpperCase();

                                if (eRoomDir1.equals("N")) { //North room 2
                                    while (true) {
//                                        BadGuy_Check(rooms_list[4], bad_guys,powers);

                                        if (BadGuy_Check(rooms_list[4], bad_guys,powers) == 0) {
                                            
                                            break;
                                        }
                                        else { Room_Door("E",2,rooms_list[4],ship_item,bad_guys,stomch,powers,food_item);
                                            //Stuff in the room blah blah
                                            Scanner eRoom2Dir = new Scanner(System.in);
                                            System.out.println("\nChoose a Direction \nType 'N' for next room - 'B' to go back: ");
                                            String eRoom2Dir1 = eRoom2Dir.nextLine();
                                            eRoom2Dir1 = eRoom2Dir1.toUpperCase();

                                            if (eRoom2Dir1.equals("N")) {
//                                                BadGuy_Check(rooms_list[5], bad_guys,powers);

                                                if (BadGuy_Check(rooms_list[5], bad_guys,powers) == 0) {
                                                    
                                                    break;
                                                }
                                                else {
                                                    Room_Door("E",3,rooms_list[5],ship_item,bad_guys,stomch,powers,food_item);

                                                    while (true) {
                                                        Scanner eRoom3Dir = new Scanner(System.in);
                                                        System.out.println("\nType 'B' to go back: ");
                                                        String eRoom3Dir1 = eRoom3Dir.nextLine();
                                                        eRoom3Dir1 = eRoom3Dir1.toUpperCase();

                                                        //checks for letter S
                                                        if (eRoom3Dir1.equals("B")) {
                                                            break;
                                                        } else {
                                                            System.out.println("\nInvalid Input\n");
                                                        }//checks so letter S
                                                    }//loop North room 3 loop
                                                }

                                            } //northern movement

                                            else if (eRoom2Dir1.equals("B")) {
                                                break; //////////////////////////////////leave point. BACK ONE ROOM
                                            }//if input is S to go back
                                        }




                                    } // while room two if statement

                                } // if statement N to go up
                                else if (eRoomDir1.equals("B")) {
                                    break; //leave east side, back to ship
                                } //leave ease side, back to ship
                                else {
                                    System.out.println("\nInvalid Input\n");
                                } //invalid
                            }




                        } //East room N or S while loop

                        break; //leave while loop optionsChosen

                    } //dirChosen.equals EAST

                    ////////////////////////
                    /////BELOW IS SOUTH DIRECTION, SOUTH WING
                    /////////////

                    else if (dirChosen.equals(southDir.south)){
                        System.out.println("You went South Wing\n");

                        while (true) { //SOUTH Room 1
//                            BadGuy_Check(rooms_list[6], bad_guys,powers);

                            if (BadGuy_Check(rooms_list[6], bad_guys,powers) == 0) {
                                
                                break;
                            }
                            else {
                                Room_Door("S",1,rooms_list[6],ship_item,bad_guys,stomch,powers,food_item); //SOUTH Room 1
                                //STUFF IN THE ROOM AND/OR CONSEQUENCE
                                Scanner sRoomDir = new Scanner(System.in);
                                System.out.println("\nChoose a Direction \nType 'N' for next room - 'B' to go back (Back to ship): ");
                                String sRoomDir1 = sRoomDir.nextLine();
                                sRoomDir1 = sRoomDir1.toUpperCase();

                                if (sRoomDir1.equals("N")) { //SOUTH room 2
                                    while (true) {
//                                        BadGuy_Check(rooms_list[7], bad_guys,powers);

                                        if (BadGuy_Check(rooms_list[7], bad_guys,powers) == 0) {
                                            
                                            break;
                                        }
                                        else {
                                            Room_Door("S",2,rooms_list[7],ship_item,bad_guys,stomch,powers,food_item);
                                            //Stuff in the room blah blah
                                            Scanner sRoom2Dir = new Scanner(System.in);
                                            System.out.println("\nChoose a Direction \nType 'N' for next room - 'B' to go back: ");
                                            String sRoom2Dir1 = sRoom2Dir.nextLine();
                                            sRoom2Dir1 = sRoom2Dir1.toUpperCase();

                                            if (sRoom2Dir1.equals("N")) {
//                                                BadGuy_Check(rooms_list[8], bad_guys,powers);

                                                if (BadGuy_Check(rooms_list[8], bad_guys,powers) == 0) {
                                                    
                                                    break;
                                                }
                                                else {Room_Door("S",3,rooms_list[8],ship_item,bad_guys,stomch,powers,food_item);

                                                    while (true) {
                                                        Scanner sRoom3Dir = new Scanner(System.in);
                                                        System.out.println("\nType 'B' to go back: ");
                                                        String sRoom3Dir1 = sRoom3Dir.nextLine();
                                                        sRoom3Dir1 = sRoom3Dir1.toUpperCase();

                                                        //checks for letter S
                                                        if (sRoom3Dir1.equals("B")) {
                                                            break;
                                                        } else {
                                                            System.out.println("\n\nInvalid Input");
                                                        }//checks so letter S
                                                    }//loop North room 3 loop
                                                }

                                            } //northern movement

                                            else if (sRoom2Dir1.equals("B")) {
                                                break; //////////////////////////////////leave point. come back
                                            }//if input is S to go back
                                        }


                                    } // while room two if statement

                                } // if statement N to go up
                                else if (sRoomDir1.equals("B")) {
                                    break; //leave north side, back to ship
                                } //leave north side, back to ship
                                else {
                                    System.out.println("\nInvalid Input\n");
                                } //invalid
                            }


                        } //North room N or S while loop

                        break; //leave while loop optionsChosen


                    } //dirChosen.equals SOUTH

                    ///////////////
                    /////BELOW IS THE WEST DIRECTIONS, WEST WING
                    //////////////

                    else if (dirChosen.equals(westDir.west)){


                        while (true) { //WEST Room 1
//                            BadGuy_Check(rooms_list[9], bad_guys,powers);

                            if (BadGuy_Check(rooms_list[9], bad_guys,powers) == 0) {
                                
                                break;
                            }
                            else {

                            }
                            Room_Door("W",1,rooms_list[9],ship_item,bad_guys,stomch,powers,food_item); //WEST Room 1
                            //STUFF IN THE ROOM AND/OR CONSEQUENCE
                            Scanner wRoomDir = new Scanner(System.in);
                            System.out.println("\nChoose a Direction \nType 'N' for next room - 'B' to go back (Back to ship): ");
                            String wRoomDir1 = wRoomDir.nextLine();
                            wRoomDir1 = wRoomDir1.toUpperCase();

                            if (wRoomDir1.equals("N")) { //SOUTH room 2
                                while (true) {
//                                    BadGuy_Check(rooms_list[10], bad_guys,powers);

                                    if (BadGuy_Check(rooms_list[10], bad_guys,powers) == 0) {
                                        
                                        break;
                                    }
                                    else {
                                        Room_Door("W",2,rooms_list[10],ship_item,bad_guys,stomch,powers,food_item);
                                        //Stuff in the room blah blah
                                        Scanner wRoom2Dir = new Scanner(System.in);
                                        System.out.println("\nChoose a Direction \nType 'N' for next room - 'B' to go back: ");
                                        String wRoom2Dir1 = wRoom2Dir.nextLine();
                                        wRoom2Dir1 = wRoom2Dir1.toUpperCase();

                                        if (wRoom2Dir1.equals("N")) {
//                                            BadGuy_Check(rooms_list[11], bad_guys,powers);

                                            if (BadGuy_Check(rooms_list[11], bad_guys,powers) == 0) {
                                                
                                                break;
                                            }
                                            else {
                                                Room_Door("W",3,rooms_list[11],ship_item,bad_guys,stomch,powers,food_item);

                                                while (true) {
                                                    Scanner wRoom3Dir = new Scanner(System.in);
                                                    System.out.println("\nType'B' to go back: ");
                                                    String wRoom3Dir1 = wRoom3Dir.nextLine();
                                                    wRoom3Dir1 = wRoom3Dir1.toUpperCase();

                                                    //checks for letter S
                                                    if (wRoom3Dir1.equals("B")) {
                                                        break;
                                                    } else {
                                                        System.out.println("\nInvalid Input");
                                                    }//checks so letter S
                                                }//loop North room 3 loop
                                            }

                                        } //northern movement

                                        else if (wRoom2Dir1.equals("B")) {
                                            break; //////////////////////////////////leave point. come back
                                        }//if input is S to go back
                                    }


                                } // while room two if statement

                            } // if statement N to go up
                            else if (wRoomDir1.equals("B")) {
                                break; //leave north side, back to ship
                            } //leave north side, back to ship
                            else {
                                System.out.println("\nInvalid Input\n");
                            } //invalid

                        } //North room N or S while loop

                        break; //leave while loop optionsChosen


                    }

                }//while loop Option chosen 1
            } //optionChosen 1

            else if (optionsChosen.equals("2")){
                Food_Power(stomch,food_item,powers,pocket,ship_item,the_ship_fixed,coPi_eat,count_ship);
                //should only feed the copilot
            }

            else if (optionsChosen.equals("3")){
                System.out.println("\nThis is where you build your ship and sit your copilot\n");
                The_Ship(stomch,the_ship_fixed,ship_item,count_ship);

            }
            else if (optionsChosen.equals("4")){
                //        String[] coPi_eat = {"",""}; //Alien Jelly
                //        String[] the_ship_fixed = {"o","o","m","m","w","w","w","b","r","r","co"}; //********* 0-10 (11 items)
                //
                int part_count = 0;
                for (int chekk = 0; chekk <the_ship_fixed.length; chekk++){
                    switch(the_ship_fixed[chekk]) {
                        case "o":
                            part_count += 1;
                            break;
                        case "m":
                            part_count += 1;
                            break;
                        case "w":
                            part_count += 1;
                            break;
                        case "b":
                            part_count += 1;
                            break;
                        case "r":
                            part_count += 1;
                            break;
                        case "co":
                            part_count += 1;
                            break;
                    }
                }
                for (int chekk2 = 0; chekk2 < coPi_eat.length; chekk2++){
                    switch (coPi_eat[chekk2]){
                        case "":
                            part_count += 1;
                            break;
                    }
                }
                for (int chekk3 = 0; chekk3 < stomch.length; chekk3++){
                    switch (stomch[chekk3]){
                        case "":
                            part_count += 1;
                            break;
                    }
                }

                if (part_count >= 1){
                    System.out.println("\n\nNot ready to leave yet!\nClick enter to continue\n\n");
                    Scanner nextI = new Scanner(System.in);
                    String enter_click = nextI.nextLine();
                    part_count = 0;
                }
                else {
                    System.out.println("\n\n\n\nYOU DID IT, GO HOME!\n\n\n\n");
                    break;
                }

            }
            else if (optionsChosen.equals("5")){
                Welcome();
            }
            else if (optionsChosen.equals("6")){
                System.out.println("\n\n\n\nSorry you won't get a chance to go home.\nYou will be studied by all of humanity!");
                break;
            }


        }//Main game
    }//static void

}//public class
