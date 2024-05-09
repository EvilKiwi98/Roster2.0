<template>
  <div class="home">
    <h1>Home</h1>
    <p>You must be authenticated to see this</p>
    <div>
      <card-list/>
    </div>
  </div>
</template>

<script>
import CardList from '../components/CardList.vue';
export default {
  components: {
    CardList
  }
};
</script>

<style>
.home {
  background-color: cornflowerblue;
}
</style>
