# Progtech_beadando
**Specifikáció**

Beadandómban egy számítástechnikai üzletet szeretnék megvalósítani. 

**Tervezési minták:**

**-** Prototype

**-** Template method

**-** Observer

**-** Strategia

**Felhasználás:**

   **-** Prototype tervezési mintát használnék a gépek létrehozásához, ezek lehetnek laptopok vagy asztali számítógépek, amiknek van gyártója, CPU-ja és memóriája.

   **-** A vásárlók  fel és le tudnak íratkozni hírlevelekről, amit a tulajdonos ki tud nekik küldeni , ezt Observer-rel valósítanám meg.

  **-** Lehet bevásárló kosarat is csinálni , ami a végén kiadja a végösszeget a vásárlónak. Ehez Stratégia tervezési mintát használok.

   **-** Template method-dal egy egyszerű vásárlást szimuláltam.

**Unit test ötletek:**

**-** Ne lehessen megadni negatív árat.

**-** Ne tudjon leiratkozni a felhasználó ha nincs is feliratkozva.

**-** Ne tudjunk hiányosan gépet létrehozni.
