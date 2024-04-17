import axios from 'axios';

export default {

    getCrusadeCardByCardID(cardId){
        return axios.get(`/CrusadeCard/${cardId}`)
    }

}