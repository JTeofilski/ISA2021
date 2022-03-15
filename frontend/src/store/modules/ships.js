import backApi from "@/api/backApi";

const state = {
    ships: []
};

const getters = {
    allShips: function (state) {
        return state.ships;
    }

};

const mutations = {
    setShips: function (state, newShips) {
        state.ships = newShips;
    }
};


const actions = {
    fetchShips: async function ({commit}) {
        const response = await backApi.get('/ship')
        commit('setShips', response.data)
    }
};


export default {
    state,
    getters,
    mutations,
    actions
}