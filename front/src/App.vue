<template>
  <div id="app">
    <header>
      <index-navbar />
    </header>
    <main>
      <section v-if="componentsName == 'Login'">
        <router-view />
      </section>
      <section
        v-else-if="componentsName != 'Login'"
        class="mx-64 mt-10 place-content-start"
      >
        <router-view />
      </section>
    </main>
    <!-- <div id="nav">
      <router-link to="/">Home</router-link> |
      <router-link to="/about">About</router-link>
    </div> -->
  </div>
</template>
<script>
// @ is an alias to /src
import IndexNavbar from "./components/IndexNavbar.vue";

export default {
  name: "Home",
  components: {
    IndexNavbar,
  },
  data() {
    return {
      componentsName: this.$route.name,
      SetStore: this.$store.SetStoreInfo,
    };
  },
};
</script>
<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
