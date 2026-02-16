with
    green_tripdata as (
        select * from {{ ref('stg_green_tripdata') }}
    ),

    yellow_tripdata as (
        select * from {{ ref('stg_yellow_tripdata') }}
    ), 

    trips_unioned as (
        select * from yellow_tripdata
        union all
        select * from green_tripdata
    )

select * from trips_unioned