# McJty-TutorialV3 Minecraft Modding Tutorial

This is a follow through of
[McJty's Minecraft modding tutorial](https://wiki.mcjty.eu/modding/index.php?title=YouTube-Tutorials-18)
with commits whenever we get a sensible point in the tutorial's narrative.

## Notes

- Final jar is created in `build/libs` 
- `mcLoc("diamond") -> new ResourceLocation("minecraft", "diamond") -> "minecraft:diamond"`
- `modLoc("block/myst_ore") -> new ResourceLocation(TutorialV3.MODID, "block/myst_ore") -> "tutorialV3:block/myst_ore"`

## Issues

- The given JEI dependency is failing:
  "jei-1.18.2-9.5.0.125_mapped_official_1.18.jar needs language provider javafml:40 or above to load"
- What maps the mysterious ore blocks onto the new tab?