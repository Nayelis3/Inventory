package com.example.inventory


import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.inventory.data.ItemDao
import org.junit.runner.RunWith
import com.example.inventory.data.InventoryDatabase

@RunWith(AndroidJUnit4::class)
class ItemDaoTest {
    private lateinit var itemDao: ItemDao
    private lateinit var inventoryDatabase: InventoryDatabase
}