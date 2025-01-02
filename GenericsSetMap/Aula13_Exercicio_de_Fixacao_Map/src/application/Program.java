package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import entites.Candidates;

public class Program {

    public static void main(String[] args) {
        // "/home/lucas/Documentos/Code/eleicoes.txt";
        Map<String, Candidates> candidates = new HashMap<>();
        try (Scanner sc = new Scanner(System.in);
             BufferedReader br = new BufferedReader(new FileReader(sc.next()))) {
            String line = br.readLine();
            while (line != null) {
                String[] candidate = line.split(",");
                String name = candidate[0];
                int votes = Integer.parseInt(candidate[1]);

                // Verificar se o candidato já está no mapa
                if (candidates.containsKey(name)) {
                    candidates.get(name).addVotes(votes); // Adicionar votos
                } else {
                    candidates.put(name, new Candidates(name, votes));
                }

                line = br.readLine();
            }

            System.out.println("RESULT OF ELECTIONS:");

            // Criar uma lista a partir dos valores do mapa e ordená-la
            List<Candidates> sortedCandidates = new ArrayList<>(candidates.values());
            sortedCandidates.sort(Comparator.comparing(Candidates::getVotes).reversed());

            for (Candidates candidate : sortedCandidates) {
                System.out.printf("%s - votes: %d%n", candidate.getName(), candidate.getVotes());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
