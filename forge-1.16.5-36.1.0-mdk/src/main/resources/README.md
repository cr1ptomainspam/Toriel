# Structuring your resources folder

- assets 
    - [mod id] 
       - blockstates
       - lang
       - models
       - textures
- data
    - [mod id]
        - loot_tables
        - recipes
    
## lang Folder
The languages folder has the structure like so:

```json
{
"item.[mod id].[item name]": "Aluminum Sword",
"block.[mod id].[block name]": "Some block"
}
```

## models > item folder
The item folder should have json files structured like so:

In folder: [registered name in ITEMS.register() method].json

Structure:
```json
{
  
}
```