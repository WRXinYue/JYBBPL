<template>
  <div class="container1">
    <video autoplay muted loop plays-inline class="back-video" src="@/assets/video/he1.mp4"></video>
  </div>
</template>

<script lang="ts" setup>
import $ from 'jquery';
// import './js/s.js';

$(document).ready(function () {
  $('p').click(function () {
    $(this).hide();
  });
});
</script>

<style lang="scss" scoped>
// @import './css/s.scss';
</style>
