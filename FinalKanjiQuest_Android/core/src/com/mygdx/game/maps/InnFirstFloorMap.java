package com.mygdx.game.maps;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.mygdx.game.Entity;

public class InnFirstFloorMap extends Map {
    private static String mapPath = "tile_maps/inn_first_floor.tmx";
    private static String herbalist = "json_scripts/herbalist.json";

    InnFirstFloorMap(){
        super(MapFactory.MapType.HERB_SHOP, mapPath);
        mapEntities.add(initSpecialEntity(Entity.getEntityConfig(herbalist)));
    }

    @Override
    public void updateMapEntities(MapManager mapMgr, Batch batch, float delta){
        for( Entity entity : mapEntities){
            entity.update(mapMgr, batch, delta);
        }
    }

}
