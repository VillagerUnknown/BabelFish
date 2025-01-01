# VillagerUnknown's Babel Fish

Adds a bright yellow fish that, when consumed from a bucket, provides translations and world hints to the player.

**Features:**

* Babel Fish Mob
* Babel Fish Translator Status Effect
* Translations and World Hints to Biomes & Structures

**Babel Fish Mob**

The Babel Fish can talk to players and, when consumed from a bucket, can provide translations for mobs to the player.

Babel Fish have a small chance to spawn in Rivers and a slightly higher chance to spawn in variations of the Warm Ocean.

If you prefer to eat a Babel Fish instead of drink one, Babel Fish can be eaten raw, but it's best to cook them with a campfire, smoker, or furnace.

For some reason, Dolphins really want you to feed them a raw Babel Fish.

**Babel Fish Translator Status Effect**

With the Babel Fish Translator status effect applied, players will see translations in chat whenever a nearby mob makes a noise.

The frequency of chat messages for translations can be controlled through the config.

**Translations and World Hints**

With the Babel Fish Translator status effect applied, mobs have a chance to provide hints to the locations of biomes and structures in the world.

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