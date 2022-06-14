# Lab 3

Lien du repo : https://github.com/Youssef2430/seg3503_playground/tree/main/Lab3

## Couverture

J'ai fais de mon mieux pour pouvoir avoir une couverture à 100% partout, mais malheureusement je n'ai pas réussi car j'i remarqué que cela était impossible.
J'avais toujours un résultat de 100% de couverture sur les "Missed instructions" mais 98% de couverture sur les "Missed Branches" comme le montre le screen ici :

![alt text](https://github.com/Youssef2430/seg3503_playground/blob/main/Lab3/screenshots/couv98-1.png?raw=true)
![alt text](https://github.com/Youssef2430/seg3503_playground/blob/main/Lab3/screenshots/couv98-2.png?raw=true)


Je me suis rendu compte qu'avoir 100% de couverture sur les "Missed branches" était impossible vu que dans le code dans la fonction isEndOfMonth() on testait si le jour était le 29 ET que l'année est un leap year mais cela s'avère non nécessaire vu que la fonction isEndOfMonth() n'est utilisée qu'une fois dans la fonction nextDate() ce qui veut dire que :
•	la vérification de la date a été déjà faite lors de la création de l'instance Date
•	si le jour est 29 c'est obligatoire que l'année soit un leap year donc pas besoin de le vérifier

D'où avoir 100% sur les "Missed branches" était impossible car il y avait un cas impossible à tester vu qu'il ne produira jamais.


## Factorisation

J'ai factorisé les fonctions où il y avait beaucoup de if qui avait des conditions communes pour améliorer le rendement et le test et j'ai aussi corrigé ce dont j'ai parlé precedemment ce qui a eu comme effet de faire monter tout les couvertures à 100% (sans avoir changé les tests bien sur) comme on peut le voir ici :

![alt text](https://github.com/Youssef2430/seg3503_playground/blob/main/Lab3/screenshots/couv100-1.png?raw=true)
![alt text](https://github.com/Youssef2430/seg3503_playground/blob/main/Lab3/screenshots/couv100-2.png?raw=true)

