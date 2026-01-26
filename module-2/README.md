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
     SELECT COUNT(filename)
     FROM massive-acrobat-485409-v0.zoomcamp.yellow_tripdata
     WHERE filename LIKE '%2020%';
    ```

Question 4:

    ```sql
     SELECT COUNT(filename)
     FROM massive-acrobat-485409-v0.zoomcamp.green_tripdata
     WHERE filename LIKE '%2020%';
    ```
    
Question 5:

    ```sql
     SELECT COUNT(*)
     FROM massive-acrobat-485409-v0.zoomcamp.yellow_tripdata
     WHERE filename LIKE '%2021_03%';
    ```
