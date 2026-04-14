package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
        String guestName;

        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        guestName = input.nextLine();
        input.close();
        // System.out.println("Il nome dell'ospite è: "+ guestName );

        // ; Check guest while version
        // int i = 0;
        // boolean isPresent = false;
        // while (!isPresent && i < guests.length ) {
        //     if (guests[i].equals(guestName)) {
        //         isPresent = true;
        //     } else {
        //         i++;
        //     }
        // }
        // if (!isPresent){
        //     System.out.println("L'ospite " + guestName +" non è sulla lista!");
        // }else{
        //     System.out.println("L'ospite "+ guestName +" è nella lista. Può entrare!");
        // }
        //! Questa è una prova di commento colorato
        ////Anche questa è una prova
        //todo : esempio di commento colorato
        //? eccone un altro ancora
        //* Checkguest for version
        int i;
        for (i = 0; i < guests.length; i++) {
            if (guestName.toLowerCase().equals(guests[i].toLowerCase())) {
                System.out.println("L'ospite " + guests[i] + " è nella lista. Può entrare!");
                break;
            }
        }
        if (i >= guests.length) {
            System.out.println("L'ospite " + guestName +" non è sulla lista!");
        }
    
    }
}
