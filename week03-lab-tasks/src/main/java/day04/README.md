Day04 Feladat

A történet: A török szultán úgy dönt 100 nappal a születésnapja
előtt, hogy kienged néhány rabot a 100 cellás börtönéből. A börtönben
a zárak kétállásúak, tehát vagy nyitva van vagy zárva. (Nem lehet
duplára zárni). Azt parancsolja az őrnek hogy a 100. szülinapjáig
minden nap menjen végig a börtönben. Az első napon minden záron
fordítson egyet, így minden ajtó nyitva lesz. A második napon,
minden második záron fordítson egyet, így minden második ajtó
bezáródik. A harmadik napon, minden harmadik záron fordítson egyet.
Így ha megnézzük a 3. ajtó zárva lesz, de a 6. nyitva. És ezt a 
folyamatot folytatja tovább, egészen a 100. napig. Az őr ezt a
procedúrát nem akarja minden nap végrehajtani, ezért segítsünk neki
és mondjuk meg, hogy a 100. napon mely ajtók lesznek nyitva, azaz
végül melyik cellákból szabadulhatnak a rabok.

A feladat megoldásához készíts egy day04.Prison nevű osztályt amiben
attribútumként tárolod a cellákat valamilyen adatszerkezetben. Az
osztályban legyen egy metódus, void openFreeCells() melyben
megvalósítod, a fenti feladathoz szükséges algoritmust, és a cella 
attribútumban a megfeleő cellák "nyitva" lesznek. Végül legyen egy
day04.Sultan nevű osztályod amiben van egy main() metódus, amiben 
példányosítasz egy börtönt, lefuttatod az algoritmust végül kiírod
a képernyőre a szabad cellák sorszámát.