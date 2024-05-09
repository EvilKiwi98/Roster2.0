<template>
    <div id="component-container">
        <h1> Greetings Traveler</h1>
        <div>
            <h3>debugger lol</h3>
            <span>  {{cardId}} </span>
        </div>
        <div class="search-container">
            <label for="card-id-input">Enter Crusade Card Id:</label>
            <input type="number" id="card-id-input" v-model="cardId" />
            <button class="button" @click="getCrusadeCardById">inshallah it works </button>
        </div>
        <div id="card-container">
            <ul>
                <li>Name: {{this.crusadeCard.unit_name}}</li>
                <li>Unit Type: {{this.crusadeCard.unit_type}}</li>
                <li>Equipment: {{this.crusadeCard.equipment}}</li>
                <li>Upgrades/Enchancements{{this.crusadeCard.enhancements_upgrades}}</li>
                <li>Point cost: {{this.crusadeCard.points_cost}}</li>
                <li>Crusade Points: {{this.crusadeCard.crusade_points}}</li>
                <li>Experience: {{this.crusadeCard.experience_points}}</li>
                <li>Unit Size: {{this.crusadeCard.model_count}}</li>
                <li>Battles played: {{this.crusadeCard.battles_played}}</li>
                <li>Battles survived: {{this.crusadeCard.battles_survived}}</li>
                <li>Units Destroyed: {{this.crusadeCard.units_destroyed}}</li>
                <li>Battle honors: {{this.crusadeCard.battle_honors}}</li>
                <li v-show="this.crusadeCard.battle_scars">Battle scars: {{this.crusadeCard.battle_scars}}</li>
                <li v-show="!this.crusadeCard.battle_scars">No battle scars. (yet!)</li>
                <li>Rank: {{this.crusadeCard.rank}}</li>


            </ul>
            
        </div>
    </div>
</template>

<script>
import CrusadeCardService from '../services/CrusadeCardService'
export default {
    data() {
        return {
            // VARIABLES
            cardId: '',
            //JSON OBJECTS
            crusadeCards: [],
            crusadeCard: {
                unitId: "",
                unitName: "",
                unitType: "",
                equipment: "",
                enhancementsUpgrades: "",
                pointsCost: "",
                crusadePoints: "",
                experiencePoints: "",
                modelCount: "",
                battlesPlayed: "",
                battlesSurvived: "",
                unitsDestroyed: "",
                battleHonors: "",
                battleScars: "",
                rank: ""
            }
        }

    },
    methods: {
        getCrusadeCardById() {
            CrusadeCardService.getCrusadeCardByCardID(this.cardId).then(
                (response) => {
                    if (response.status === 200){
                        console.log(response.data)
                        this.crusadeCard = response.data
                        console.log(this.crusadeCard)

                    }
                    else {
                        console.log('error code: ' + response.statusText)
                    }

                }
            )

        }
    }
}
</script>


<style scoped></style>