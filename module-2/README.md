Question 1:
 
    i added the task step to log the file size after dowload and extract after the extract step

```yaml
  - id: get_data_size
    type: io.kestra.plugin.core.storage.Size
    uri: "{{render(vars.data)}}"

  - id: print_data
    type: io.kestra.plugin.core.log.Log
    message: "The size of the data file is {{outputs.get_data_size.size}} bytes"
```

Question 3: 

    ```sql
        SELECT COUNT(*) as total_rows
        FROM (
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.yellow_tripdata_2020_01`
        UNION ALL
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.yellow_tripdata_2020_02`
        UNION ALL
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.yellow_tripdata_2020_03`
        UNION ALL
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.yellow_tripdata_2020_04`
        UNION ALL
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.yellow_tripdata_2020_05`
        UNION ALL
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.yellow_tripdata_2020_06`
        UNION ALL
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.yellow_tripdata_2020_07`
        UNION ALL
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.yellow_tripdata_2020_08`
        UNION ALL
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.yellow_tripdata_2020_09`
        UNION ALL
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.yellow_tripdata_2020_10`
        UNION ALL
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.yellow_tripdata_2020_11`
        UNION ALL
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.yellow_tripdata_2020_12`
        )
    ```

Question 4:

    ```SQL
        SELECT COUNT(*) as total_rows
        FROM (
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.green_tripdata_2020_01`
        UNION ALL
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.green_tripdata_2020_02`
        UNION ALL
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.green_tripdata_2020_03`
        UNION ALL
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.green_tripdata_2020_04`
        UNION ALL
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.green_tripdata_2020_05`
        UNION ALL
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.green_tripdata_2020_06`
        UNION ALL
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.green_tripdata_2020_07`
        UNION ALL
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.green_tripdata_2020_08`
        UNION ALL
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.green_tripdata_2020_09`
        UNION ALL
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.green_tripdata_2020_10`
        UNION ALL
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.green_tripdata_2020_11`
        UNION ALL
        SELECT * FROM `massive-acrobat-485409-v0.zoomcamp.green_tripdata_2020_12`
        )
    ```