<template>
    <div id="component-container">
        <h1> Greetings Traveler</h1>
        <div>
            <h3>debugger lol</h3>
            <span> {{ cardId }} </span>
        </div>
        <div class="search-container">
            <label for="card-id-input">Enter Crusade Card Id:</label>
            <input type="number" id="card-id-input" v-model="cardId" />
            <button class="button" @click="getCrusadeCardById">inshallah it works </button>
        </div>
        <div id="card-container">
            <h3> Here </h3>
            <ul>
                <li v-for="crusadecard in crusadeCards" :key="crusadecard.cardId" class="card-item">
                    <span> {{ crusadecard.unitName }}</span>
                    <span> {{crusadecard.unitType}}</span>

                </li>
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
            crusadecard: {
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
        getCrusadeCardById(cardId) {
            CrusadeCardService.getCrusadeCardByCardID(cardId).then(
                (response) => {
                    this.crusadeCards = response.data
                    console.log(response.data)
                }
            )

        }
    }
}
</script>


<style scoped></style>