# LunaGC-5.3.0

[简中](docs/README_zh-CN.md)

My Discord https://discord.gg/8vSyTHVphj

Please contribute actively to this repository

# Setup Guide

This guide is very minimal and contains steps to just get your server and client up and running.

## You'll need to patch the game to even enter the game world (see below).

## Read the handbook (found at the end of the file)

## Main Requirements

- Get [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- Get [MongoDB Community Server](https://www.mongodb.com/try/download/community)
- Get [NodeJS](https://nodejs.org/dist/v20.15.0/node-v20.15.0-x64.msi)
- Get game version REL5.3.0 (If you don't have a 5.3.0 client, you can find it here along with the audio files and hdiff if needed) :

| Download link | Package size | Decompressed package size | MD5 checksum |
| --- | --- | --- | --- |
| [GenshinImpact_5.3.0.zip.001](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241219110745_1vT3FzXdDTDFZFrL/GenshinImpact_5.3.0.zip.001) | 10.0 GB | 20.0 GB | d7ea7d49334e03e590db3f047cd9ea88 |
| [GenshinImpact_5.3.0.zip.002](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241219110745_1vT3FzXdDTDFZFrL/GenshinImpact_5.3.0.zip.002) | 10.0 GB | 20.0 GB | b4178034c1d09e889e43fd76b3fb4d3c |
| [GenshinImpact_5.3.0.zip.003](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241219110745_1vT3FzXdDTDFZFrL/GenshinImpact_5.3.0.zip.003) | 10.0 GB | 20.0 GB | 43b70975fcb957abaaaf7d940969679a |
| [GenshinImpact_5.3.0.zip.004](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241219110745_1vT3FzXdDTDFZFrL/GenshinImpact_5.3.0.zip.004) | 10.0 GB | 20.0 GB | d734b1edeb1b2b0d47d4d4bab7af6778 |
| [GenshinImpact_5.3.0.zip.005](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241219110745_1vT3FzXdDTDFZFrL/GenshinImpact_5.3.0.zip.005) | 10.0 GB | 20.0 GB | 95abe987ff924c21f3e5085492448760 |
| [GenshinImpact_5.3.0.zip.006](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241219110745_1vT3FzXdDTDFZFrL/GenshinImpact_5.3.0.zip.006) | 10.0 GB | 20.0 GB | 492510ae74ae8ac696ee59b4e831d039 |
| [GenshinImpact_5.3.0.zip.007](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241219110745_1vT3FzXdDTDFZFrL/GenshinImpact_5.3.0.zip.007) | 10.0 GB | 20.0 GB | 0c68334b33ee878c5beac321339b9447 |
| [GenshinImpact_5.3.0.zip.008](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241219110745_1vT3FzXdDTDFZFrL/GenshinImpact_5.3.0.zip.008) | 0.97 GB | 1.9 GB | 18d44596a5f1467682f5e038c80bd92a |
| [Audio_Chinese_5.3.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241219110745_1vT3FzXdDTDFZFrL/Audio_Chinese_5.3.0.zip) | 14.11 GB | 28.40 GB | 2727087a20d630d35efe804ae683e72e |
| [Audio_English(US)_5.3.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241219110745_1vT3FzXdDTDFZFrL/Audio_English(US)_5.3.0.zip) | 16.24 GB | 32.49 GB | 76f338d1925ff39cbf73f0418e9ae354 |
| [Audio_Korean_5.3.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241219110745_1vT3FzXdDTDFZFrL/Audio_Korean_5.3.0.zip) | 13.99 GB | 28.0 GB | 6356a494c7cce397bdbb1213aa6e7298 |
| [Audio_Japanese_5.3.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241219110745_1vT3FzXdDTDFZFrL/Audio_Japanese_5.3.0.zip) | 18.43 GB | 36.88 GB | f2b1c1f217dafbcdf27aeece987256b7 |

- Or get the 5.2.0 -> 5.3.0 hdiffs:

| Download link | Package size | Decompressed package size | MD5 checksum |
| --- | --- | --- | --- |
| [game_5.2.0_5.3.0_hdiff_cixFUHQZyAJuOKIN.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/game_5.2.0_5.3.0_hdiff_cixFUHQZyAJuOKIN.zip) | 17.16 GB | 35.14 GB | 46b32c38dbb348a172df8352074da5a1 |
| [audio_ko-kr_5.2.0_5.3.0_hdiff_oyddjWZZfxEwaTYM.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_ko-kr_5.2.0_5.3.0_hdiff_oyddjWZZfxEwaTYM.zip) | 0.68 GB | 1.47 GB | fcee09acf85cdd2dd1d30bdea69c9065 |
| [audio_ja-jp_5.2.0_5.3.0_hdiff_mqXJGZjryItulRRx.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_ja-jp_5.2.0_5.3.0_hdiff_mqXJGZjryItulRRx.zip) | 0.78 GB | 1.74 GB | 68146dc2e2ea63b0cae452ea01b23136 |
| [audio_zh-cn_5.2.0_5.3.0_hdiff_zFnGPPbohnwLAFxC.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_zh-cn_5.2.0_5.3.0_hdiff_zFnGPPbohnwLAFxC.zip) | 0.64 GB | 1.41 GB | 3b4f264bd791b5f81eb165fe6d36676e |
| [audio_en-us_5.2.0_5.3.0_hdiff_kFXfWOqklZrcycKa.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_en-us_5.2.0_5.3.0_hdiff_kFXfWOqklZrcycKa.zip) | 0.65 GB | 1.42 GB | c7189fa380b90a343cc56b7d8438eaba |

- Make sure to install java and set the environment variables.
- Build the server (refer to "Compile the actual server" in this guide.)
- Put [Astrolabe.dll](https://github.com/Kei-Luna/LunaGC_5.3.0/raw/main/patch/Astrolabe.dll) in the local game root directory
- Download the [Resources](https://github.com/pmagixc/5.3-res), make a new folder called `resources` in the downloaded LunaGC folder and then extract the resources in that new folder.
- Set useEncryption, Questing and useInRouting to false (it should be false by default, if not then change it)
- Start the server and the game, make sure to also create an account in the LunaGC console!
- Have fun

### Getting started

- Clone the repository (install [Git](https://git-scm.com) first )
  
  ```
  git clone https://github.com/Kei-Luna/LunaGC_5.3.0.git
  ```
  
- Now you can continue with the steps below.
  

### Compile the actual Server

**Requirements**:

[Java Development Kit 17 | JDK](https://oracle.com/java/technologies/javase/jdk17-archive-downloads.html) or higher

- **Sidenote**: Handbook generation may fail on some systems. To disable handbook generation, append `-PskipHandbook=1` to the `gradlew jar` command.
  
- **For Windows**:
  
  ```shell
  .\gradlew.bat
  .\gradlew.bat jar
  ```
  
- **For Linux**:
  
  ```bash
  chmod +x gradlew
  ./gradlew jar
  ```

### You can find the output JAR in the project root folder.

### Manually compile the handbook

```shell
./gradlew generateHandbook
```

## Troubleshooting

- Make sure to set useEncryption and useInRouting both to false otherwise you might encounter errors.
- To use windy make sure that you put your luac files in C:\Windy (make the folder if it doesnt exist)
- If you get an error related to MongoDB connection timeout, check if the mongodb service is running. On windows: Press windows key and r then type `services.msc`, look for mongodb server and if it's not started then start it by right clicking on it and start. On linux, you can do `systemctl status mongod` to see if it's running, if it isn't then type `systemctl start mongod`. However, if you get error 14 on linux change the owner of the mongodb folder and the .sock file (`sudo chown -R mongodb:mongodb /var/lib/mongodb` and `sudo chown mongodb:mongodb /tmp/mongodb-27017.sock` then try to start the service again.)

## How to make or get custom banners?

- Pre-made: [github repo](https://github.com/Zhaokugua/Grasscutter_Banners)
- Rename the file you chose to download to Banners.json and replace it with the already-existing one in the data folder.
- The repo also offers a file which contains all of the banners, to use it follow the same procedure mentioned above.
  
  ### Making custom banners
  
- If you want to make a custom banner for a character or weapon, you'll need to know the prefabPath, the titlePath and the character/item IDs.
- Fun fact: You can set any item to be on the rateUp, even if it's a 4* instead of a 5*.

## Handmade Handbook (NOT tested)

- Create accounts: /account <username>
- Get all achievements: /am grantall
- God mode: /prop god 1
- Enter a domain: /dungeon <ID>
- Unlimited stamina: /prop ns 0
- Unlimited energy: /prop UnlimitedEnergy 1
- Recharge energy: /er
- Set constellation for selected character: /setConst <number 1 to 6>
- Get rid of the skill cooldown: /stat cdr 99
- Change weather: /weather <sunny/rain/cloudy/thunderstorm/snow/mist>
- Change talent for selected character: /talent <n/e/q/all> <level> (n - normal attack only) (e - skill only) (q - burst only)
- Give items: /g <itemId|avatarId|all|weapons|mats|avatars> [lv<number>] [r<refinement number>] [x<amount>] [c<constellation number>] [sl<skilllevel>]
- Unlock all: /unlockall
- Change world level: /prop wl <number>
- Change AR: /prop player_level <number between 1 and 60>
- Change the game speed: /gamespeed <0.1|0.2|0.5|0.75|1.0|1.5|2.0|3.0>
- Get 9999 Intertwined fates: /g 223 x9999
- Get 9999 Acquaint fates: /g 224 x9999
- Get 9999 Mora: /g 202 x9999
- Get 9999 Primogems: /g 201 x9999
  
  ### Make sure to not include <> or [] in the commands! The stuff in <> means its required and the stuff in [] means its not required.
  
  ### How to get all of the stuff maxed out: /g all lv90 r5 c6 c6 sl10 | Then do a separate one for the materials: /g mats x99999
  
  ### Ways to TP around the map:
  

Method 1:

- 1: Unlock the map: /prop um 1
- 2: Open the map
- 3: Use the waypoints

Method 2:

- 1: Open the map
- 2: Place a fishing rod marker (the last one) where you want to teleport and mark it.
  
  ### How to get avatar/entity/material etc. IDs?
  
- Go to [ambr.top](https://ambr.top)
- Search up the material/avatar/enemy and then the ID of it should be in the URL of the site, for example I searched for the pyro hilichurl archer; the link for it is ambr.top/en/archive/monster/21010501/pyro-hilichurl-shooter so the ID for it will be 21010501.

### How to spawn monsters?

- Get the ID from the ambr.top link (above)
- Do /spawn <id> in the in-game chat. You can also find out more arguments that you can use to modify the monster hp etc by doing `/help spawn` or `/spawn` | Example: `/spawn 21010501`, that will spawn a pyro hilichurl. Give it more hp: `/spawn 21010501 hp9999` and you can find more about the arguments trough the method I mentioned above.

### How to use the /uid command?

- Rich text is supported
- How to set custom UID: `/uid set changethistext` | bold: `/uid set <b>changethistext</b>` | italic: `/uid set <i>changethistext</i>` | combined: `/uid set <i><b>changethistext</b></i>` | colored text (you'll need a hex color code, you can easy get and pick one by search hex color picker on google now let's assume that you have done it): `/uid set <color=#698ae8>changethistext</color>`
- You can also include spaces like this: `/uid set <b>B O L D</b>`
- You can combine the bold, italic and colored text
- Restore to server-default UID: `/uid default`

## What doesn't work

- find out
