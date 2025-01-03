# VillagerUnknown's Babel Fish

Adds a bright yellow fish that, when consumed from a bucket, provides translations and world hints to the player.

**Features:**

* Babel Fish Mob
* Babel Fish Translator Status Effect
* Translations and World Hints to Biomes & Structures

**Options**

* **Babel Fish Translation Radius** - Radius from players to detect mobs to translate
* **World Hint Search Radius** - Radius to search for biomes and structures
* **Translation Chat Message Entity Reduction Factor** - Percentage to reduce chance for messages based on the number of nearby entities
* **Translation Chat Message Minimum Chance** - Minimum chance to send a translation
* **Translation Chat Message Delay** - Delay in ticks between sending translations
* **Chance for Translation from Sound** - Chance to provide a translation when a sound plays.
* **Chance for Babel Fish Chatter** - Chance for random chatter from the Babel Fish allowing the translations
* **Chance for World Hint** - Chance to provide a hint to a biome or structure as a translation.
* **Chance for Structure Hint** - Chance to provide a structure hint instead of a biome hint as the world hint.

**Babel Fish Mob**

The Babel Fish can talk to players and, when consumed from a bucket, can provide translations for mobs to the player.

Babel Fish have a small chance to spawn in Rivers and a slightly higher chance to spawn in variations of the Warm Ocean.

If you prefer to eat a Babel Fish instead of drink one, Babel Fish can be eaten raw, but it's best to cook them with a campfire, smoker, or furnace.

For some reason, Dolphins really want you to feed them Babel Fish raw.

**Babel Fish Translator Status Effect**

With the Babel Fish Translator status effect applied, players will see translations in chat whenever a nearby mob makes a noise.

The frequency of chat messages for translations can be controlled through the config.

**Translations and World Hints**

With the Babel Fish Translator status effect applied, mobs have a chance to provide hints to the locations of biomes and structures in the world.

For example:
* **Bees** - Flower Forests
* **Fish** - Ocean Monuments, Ocean Ruins, Ruined Portals in the Ocean, Rivers, and all Oceans
* **Villagers** - Jungle Temples, Mansions, Pillager Outposts, Swamp Hut, Trail Ruins, Trial Chambers, and all Villages
* **Pillagers** - Mansions, Pillager Outposts, and all Villages
* **Zombies** - Deep Dark, Ancient Cities, Mineshafts, and Trail Ruins
* **Skeletons** - Deep Dark, Ancient Cities, Shipwrecks, and Buried Treasures
* **Creepers** - Desert Temples
* **Piglins** - Crimson Forests, Warped Forests, Bastions, and Fortresses
* **Enderman** - Deep Dark, Ruined Portals, Ancient Cities, Strongholds, Fortresses, and End Cities
* **Wandering Traders** - Cherry Groves, Jungles, Swamps, Mangrove Swamps, Badlands, Desert, Ice Spikes, Meadow, Desert Temples, Mansions, Pillager Outposts, Beached Shipwrecks, Swamp Hut, Trail Ruins, and all Villages

## Support

* Get support and share feedback at https://discord.gg/PXjXh6M38H
* Request features and report bugs at https://github.com/VillagerUnknown/BabelFish/issues
* View the changelog at https://github.com/VillagerUnknown/BabelFish/blob/main/CHANGELOG.md

**Known Issues**

* The Babel Fish Translator status effect can impact performance as it frequently uses code similar to the `/locate` command for world hints. This is controlled by the `worldHintSearchRadius` config value. By default, this is set to the lowest possible value. Increase this value at your own discretion.