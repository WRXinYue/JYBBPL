<template>
  <el-result icon="warning" title="404 NOT FOUND" sub-title="您寻找的页面已经丢失">
    <template #extra>
      <el-button type="primary" @click="$router.push('/')">Back</el-button>
    </template>
  </el-result>
</template>

<script lang="ts" setup></script>
