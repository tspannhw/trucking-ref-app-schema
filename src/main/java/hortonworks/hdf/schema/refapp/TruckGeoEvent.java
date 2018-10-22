/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package hortonworks.hdf.schema.refapp;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TruckGeoEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4937967323102442185L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TruckGeoEvent\",\"namespace\":\"hortonworks.hdf.schema.refapp\",\"fields\":[{\"name\":\"eventTime\",\"type\":\"string\"},{\"name\":\"eventTimeLong\",\"type\":\"long\",\"default\":0},{\"name\":\"eventSource\",\"type\":\"string\"},{\"name\":\"truckId\",\"type\":\"int\"},{\"name\":\"driverId\",\"type\":\"int\"},{\"name\":\"driverName\",\"type\":\"string\"},{\"name\":\"routeId\",\"type\":\"int\"},{\"name\":\"route\",\"type\":\"string\"},{\"name\":\"eventType\",\"type\":\"string\"},{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"},{\"name\":\"correlationId\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TruckGeoEvent> ENCODER =
      new BinaryMessageEncoder<TruckGeoEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TruckGeoEvent> DECODER =
      new BinaryMessageDecoder<TruckGeoEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<TruckGeoEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<TruckGeoEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TruckGeoEvent>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this TruckGeoEvent to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a TruckGeoEvent from a ByteBuffer. */
  public static TruckGeoEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence eventTime;
  @Deprecated public long eventTimeLong;
  @Deprecated public java.lang.CharSequence eventSource;
  @Deprecated public int truckId;
  @Deprecated public int driverId;
  @Deprecated public java.lang.CharSequence driverName;
  @Deprecated public int routeId;
  @Deprecated public java.lang.CharSequence route;
  @Deprecated public java.lang.CharSequence eventType;
  @Deprecated public double latitude;
  @Deprecated public double longitude;
  @Deprecated public long correlationId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TruckGeoEvent() {}

  /**
   * All-args constructor.
   * @param eventTime The new value for eventTime
   * @param eventTimeLong The new value for eventTimeLong
   * @param eventSource The new value for eventSource
   * @param truckId The new value for truckId
   * @param driverId The new value for driverId
   * @param driverName The new value for driverName
   * @param routeId The new value for routeId
   * @param route The new value for route
   * @param eventType The new value for eventType
   * @param latitude The new value for latitude
   * @param longitude The new value for longitude
   * @param correlationId The new value for correlationId
   */
  public TruckGeoEvent(java.lang.CharSequence eventTime, java.lang.Long eventTimeLong, java.lang.CharSequence eventSource, java.lang.Integer truckId, java.lang.Integer driverId, java.lang.CharSequence driverName, java.lang.Integer routeId, java.lang.CharSequence route, java.lang.CharSequence eventType, java.lang.Double latitude, java.lang.Double longitude, java.lang.Long correlationId) {
    this.eventTime = eventTime;
    this.eventTimeLong = eventTimeLong;
    this.eventSource = eventSource;
    this.truckId = truckId;
    this.driverId = driverId;
    this.driverName = driverName;
    this.routeId = routeId;
    this.route = route;
    this.eventType = eventType;
    this.latitude = latitude;
    this.longitude = longitude;
    this.correlationId = correlationId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return eventTime;
    case 1: return eventTimeLong;
    case 2: return eventSource;
    case 3: return truckId;
    case 4: return driverId;
    case 5: return driverName;
    case 6: return routeId;
    case 7: return route;
    case 8: return eventType;
    case 9: return latitude;
    case 10: return longitude;
    case 11: return correlationId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: eventTime = (java.lang.CharSequence)value$; break;
    case 1: eventTimeLong = (java.lang.Long)value$; break;
    case 2: eventSource = (java.lang.CharSequence)value$; break;
    case 3: truckId = (java.lang.Integer)value$; break;
    case 4: driverId = (java.lang.Integer)value$; break;
    case 5: driverName = (java.lang.CharSequence)value$; break;
    case 6: routeId = (java.lang.Integer)value$; break;
    case 7: route = (java.lang.CharSequence)value$; break;
    case 8: eventType = (java.lang.CharSequence)value$; break;
    case 9: latitude = (java.lang.Double)value$; break;
    case 10: longitude = (java.lang.Double)value$; break;
    case 11: correlationId = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'eventTime' field.
   * @return The value of the 'eventTime' field.
   */
  public java.lang.CharSequence getEventTime() {
    return eventTime;
  }

  /**
   * Sets the value of the 'eventTime' field.
   * @param value the value to set.
   */
  public void setEventTime(java.lang.CharSequence value) {
    this.eventTime = value;
  }

  /**
   * Gets the value of the 'eventTimeLong' field.
   * @return The value of the 'eventTimeLong' field.
   */
  public java.lang.Long getEventTimeLong() {
    return eventTimeLong;
  }

  /**
   * Sets the value of the 'eventTimeLong' field.
   * @param value the value to set.
   */
  public void setEventTimeLong(java.lang.Long value) {
    this.eventTimeLong = value;
  }

  /**
   * Gets the value of the 'eventSource' field.
   * @return The value of the 'eventSource' field.
   */
  public java.lang.CharSequence getEventSource() {
    return eventSource;
  }

  /**
   * Sets the value of the 'eventSource' field.
   * @param value the value to set.
   */
  public void setEventSource(java.lang.CharSequence value) {
    this.eventSource = value;
  }

  /**
   * Gets the value of the 'truckId' field.
   * @return The value of the 'truckId' field.
   */
  public java.lang.Integer getTruckId() {
    return truckId;
  }

  /**
   * Sets the value of the 'truckId' field.
   * @param value the value to set.
   */
  public void setTruckId(java.lang.Integer value) {
    this.truckId = value;
  }

  /**
   * Gets the value of the 'driverId' field.
   * @return The value of the 'driverId' field.
   */
  public java.lang.Integer getDriverId() {
    return driverId;
  }

  /**
   * Sets the value of the 'driverId' field.
   * @param value the value to set.
   */
  public void setDriverId(java.lang.Integer value) {
    this.driverId = value;
  }

  /**
   * Gets the value of the 'driverName' field.
   * @return The value of the 'driverName' field.
   */
  public java.lang.CharSequence getDriverName() {
    return driverName;
  }

  /**
   * Sets the value of the 'driverName' field.
   * @param value the value to set.
   */
  public void setDriverName(java.lang.CharSequence value) {
    this.driverName = value;
  }

  /**
   * Gets the value of the 'routeId' field.
   * @return The value of the 'routeId' field.
   */
  public java.lang.Integer getRouteId() {
    return routeId;
  }

  /**
   * Sets the value of the 'routeId' field.
   * @param value the value to set.
   */
  public void setRouteId(java.lang.Integer value) {
    this.routeId = value;
  }

  /**
   * Gets the value of the 'route' field.
   * @return The value of the 'route' field.
   */
  public java.lang.CharSequence getRoute() {
    return route;
  }

  /**
   * Sets the value of the 'route' field.
   * @param value the value to set.
   */
  public void setRoute(java.lang.CharSequence value) {
    this.route = value;
  }

  /**
   * Gets the value of the 'eventType' field.
   * @return The value of the 'eventType' field.
   */
  public java.lang.CharSequence getEventType() {
    return eventType;
  }

  /**
   * Sets the value of the 'eventType' field.
   * @param value the value to set.
   */
  public void setEventType(java.lang.CharSequence value) {
    this.eventType = value;
  }

  /**
   * Gets the value of the 'latitude' field.
   * @return The value of the 'latitude' field.
   */
  public java.lang.Double getLatitude() {
    return latitude;
  }

  /**
   * Sets the value of the 'latitude' field.
   * @param value the value to set.
   */
  public void setLatitude(java.lang.Double value) {
    this.latitude = value;
  }

  /**
   * Gets the value of the 'longitude' field.
   * @return The value of the 'longitude' field.
   */
  public java.lang.Double getLongitude() {
    return longitude;
  }

  /**
   * Sets the value of the 'longitude' field.
   * @param value the value to set.
   */
  public void setLongitude(java.lang.Double value) {
    this.longitude = value;
  }

  /**
   * Gets the value of the 'correlationId' field.
   * @return The value of the 'correlationId' field.
   */
  public java.lang.Long getCorrelationId() {
    return correlationId;
  }

  /**
   * Sets the value of the 'correlationId' field.
   * @param value the value to set.
   */
  public void setCorrelationId(java.lang.Long value) {
    this.correlationId = value;
  }

  /**
   * Creates a new TruckGeoEvent RecordBuilder.
   * @return A new TruckGeoEvent RecordBuilder
   */
  public static hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder newBuilder() {
    return new hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder();
  }

  /**
   * Creates a new TruckGeoEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TruckGeoEvent RecordBuilder
   */
  public static hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder newBuilder(hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder other) {
    return new hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder(other);
  }

  /**
   * Creates a new TruckGeoEvent RecordBuilder by copying an existing TruckGeoEvent instance.
   * @param other The existing instance to copy.
   * @return A new TruckGeoEvent RecordBuilder
   */
  public static hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder newBuilder(hortonworks.hdf.schema.refapp.TruckGeoEvent other) {
    return new hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder(other);
  }

  /**
   * RecordBuilder for TruckGeoEvent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TruckGeoEvent>
    implements org.apache.avro.data.RecordBuilder<TruckGeoEvent> {

    private java.lang.CharSequence eventTime;
    private long eventTimeLong;
    private java.lang.CharSequence eventSource;
    private int truckId;
    private int driverId;
    private java.lang.CharSequence driverName;
    private int routeId;
    private java.lang.CharSequence route;
    private java.lang.CharSequence eventType;
    private double latitude;
    private double longitude;
    private long correlationId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.eventTime)) {
        this.eventTime = data().deepCopy(fields()[0].schema(), other.eventTime);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.eventTimeLong)) {
        this.eventTimeLong = data().deepCopy(fields()[1].schema(), other.eventTimeLong);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.eventSource)) {
        this.eventSource = data().deepCopy(fields()[2].schema(), other.eventSource);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.truckId)) {
        this.truckId = data().deepCopy(fields()[3].schema(), other.truckId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.driverId)) {
        this.driverId = data().deepCopy(fields()[4].schema(), other.driverId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.driverName)) {
        this.driverName = data().deepCopy(fields()[5].schema(), other.driverName);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.routeId)) {
        this.routeId = data().deepCopy(fields()[6].schema(), other.routeId);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.route)) {
        this.route = data().deepCopy(fields()[7].schema(), other.route);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.eventType)) {
        this.eventType = data().deepCopy(fields()[8].schema(), other.eventType);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.latitude)) {
        this.latitude = data().deepCopy(fields()[9].schema(), other.latitude);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.longitude)) {
        this.longitude = data().deepCopy(fields()[10].schema(), other.longitude);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.correlationId)) {
        this.correlationId = data().deepCopy(fields()[11].schema(), other.correlationId);
        fieldSetFlags()[11] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing TruckGeoEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(hortonworks.hdf.schema.refapp.TruckGeoEvent other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.eventTime)) {
        this.eventTime = data().deepCopy(fields()[0].schema(), other.eventTime);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.eventTimeLong)) {
        this.eventTimeLong = data().deepCopy(fields()[1].schema(), other.eventTimeLong);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.eventSource)) {
        this.eventSource = data().deepCopy(fields()[2].schema(), other.eventSource);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.truckId)) {
        this.truckId = data().deepCopy(fields()[3].schema(), other.truckId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.driverId)) {
        this.driverId = data().deepCopy(fields()[4].schema(), other.driverId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.driverName)) {
        this.driverName = data().deepCopy(fields()[5].schema(), other.driverName);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.routeId)) {
        this.routeId = data().deepCopy(fields()[6].schema(), other.routeId);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.route)) {
        this.route = data().deepCopy(fields()[7].schema(), other.route);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.eventType)) {
        this.eventType = data().deepCopy(fields()[8].schema(), other.eventType);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.latitude)) {
        this.latitude = data().deepCopy(fields()[9].schema(), other.latitude);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.longitude)) {
        this.longitude = data().deepCopy(fields()[10].schema(), other.longitude);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.correlationId)) {
        this.correlationId = data().deepCopy(fields()[11].schema(), other.correlationId);
        fieldSetFlags()[11] = true;
      }
    }

    /**
      * Gets the value of the 'eventTime' field.
      * @return The value.
      */
    public java.lang.CharSequence getEventTime() {
      return eventTime;
    }

    /**
      * Sets the value of the 'eventTime' field.
      * @param value The value of 'eventTime'.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder setEventTime(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.eventTime = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'eventTime' field has been set.
      * @return True if the 'eventTime' field has been set, false otherwise.
      */
    public boolean hasEventTime() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'eventTime' field.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder clearEventTime() {
      eventTime = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'eventTimeLong' field.
      * @return The value.
      */
    public java.lang.Long getEventTimeLong() {
      return eventTimeLong;
    }

    /**
      * Sets the value of the 'eventTimeLong' field.
      * @param value The value of 'eventTimeLong'.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder setEventTimeLong(long value) {
      validate(fields()[1], value);
      this.eventTimeLong = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'eventTimeLong' field has been set.
      * @return True if the 'eventTimeLong' field has been set, false otherwise.
      */
    public boolean hasEventTimeLong() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'eventTimeLong' field.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder clearEventTimeLong() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'eventSource' field.
      * @return The value.
      */
    public java.lang.CharSequence getEventSource() {
      return eventSource;
    }

    /**
      * Sets the value of the 'eventSource' field.
      * @param value The value of 'eventSource'.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder setEventSource(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.eventSource = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'eventSource' field has been set.
      * @return True if the 'eventSource' field has been set, false otherwise.
      */
    public boolean hasEventSource() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'eventSource' field.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder clearEventSource() {
      eventSource = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'truckId' field.
      * @return The value.
      */
    public java.lang.Integer getTruckId() {
      return truckId;
    }

    /**
      * Sets the value of the 'truckId' field.
      * @param value The value of 'truckId'.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder setTruckId(int value) {
      validate(fields()[3], value);
      this.truckId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'truckId' field has been set.
      * @return True if the 'truckId' field has been set, false otherwise.
      */
    public boolean hasTruckId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'truckId' field.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder clearTruckId() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'driverId' field.
      * @return The value.
      */
    public java.lang.Integer getDriverId() {
      return driverId;
    }

    /**
      * Sets the value of the 'driverId' field.
      * @param value The value of 'driverId'.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder setDriverId(int value) {
      validate(fields()[4], value);
      this.driverId = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'driverId' field has been set.
      * @return True if the 'driverId' field has been set, false otherwise.
      */
    public boolean hasDriverId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'driverId' field.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder clearDriverId() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'driverName' field.
      * @return The value.
      */
    public java.lang.CharSequence getDriverName() {
      return driverName;
    }

    /**
      * Sets the value of the 'driverName' field.
      * @param value The value of 'driverName'.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder setDriverName(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.driverName = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'driverName' field has been set.
      * @return True if the 'driverName' field has been set, false otherwise.
      */
    public boolean hasDriverName() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'driverName' field.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder clearDriverName() {
      driverName = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'routeId' field.
      * @return The value.
      */
    public java.lang.Integer getRouteId() {
      return routeId;
    }

    /**
      * Sets the value of the 'routeId' field.
      * @param value The value of 'routeId'.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder setRouteId(int value) {
      validate(fields()[6], value);
      this.routeId = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'routeId' field has been set.
      * @return True if the 'routeId' field has been set, false otherwise.
      */
    public boolean hasRouteId() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'routeId' field.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder clearRouteId() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'route' field.
      * @return The value.
      */
    public java.lang.CharSequence getRoute() {
      return route;
    }

    /**
      * Sets the value of the 'route' field.
      * @param value The value of 'route'.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder setRoute(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.route = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'route' field has been set.
      * @return True if the 'route' field has been set, false otherwise.
      */
    public boolean hasRoute() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'route' field.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder clearRoute() {
      route = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'eventType' field.
      * @return The value.
      */
    public java.lang.CharSequence getEventType() {
      return eventType;
    }

    /**
      * Sets the value of the 'eventType' field.
      * @param value The value of 'eventType'.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder setEventType(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.eventType = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'eventType' field has been set.
      * @return True if the 'eventType' field has been set, false otherwise.
      */
    public boolean hasEventType() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'eventType' field.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder clearEventType() {
      eventType = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'latitude' field.
      * @return The value.
      */
    public java.lang.Double getLatitude() {
      return latitude;
    }

    /**
      * Sets the value of the 'latitude' field.
      * @param value The value of 'latitude'.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder setLatitude(double value) {
      validate(fields()[9], value);
      this.latitude = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'latitude' field has been set.
      * @return True if the 'latitude' field has been set, false otherwise.
      */
    public boolean hasLatitude() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'latitude' field.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder clearLatitude() {
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'longitude' field.
      * @return The value.
      */
    public java.lang.Double getLongitude() {
      return longitude;
    }

    /**
      * Sets the value of the 'longitude' field.
      * @param value The value of 'longitude'.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder setLongitude(double value) {
      validate(fields()[10], value);
      this.longitude = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'longitude' field has been set.
      * @return True if the 'longitude' field has been set, false otherwise.
      */
    public boolean hasLongitude() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'longitude' field.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder clearLongitude() {
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'correlationId' field.
      * @return The value.
      */
    public java.lang.Long getCorrelationId() {
      return correlationId;
    }

    /**
      * Sets the value of the 'correlationId' field.
      * @param value The value of 'correlationId'.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder setCorrelationId(long value) {
      validate(fields()[11], value);
      this.correlationId = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'correlationId' field has been set.
      * @return True if the 'correlationId' field has been set, false otherwise.
      */
    public boolean hasCorrelationId() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'correlationId' field.
      * @return This builder.
      */
    public hortonworks.hdf.schema.refapp.TruckGeoEvent.Builder clearCorrelationId() {
      fieldSetFlags()[11] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TruckGeoEvent build() {
      try {
        TruckGeoEvent record = new TruckGeoEvent();
        record.eventTime = fieldSetFlags()[0] ? this.eventTime : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.eventTimeLong = fieldSetFlags()[1] ? this.eventTimeLong : (java.lang.Long) defaultValue(fields()[1]);
        record.eventSource = fieldSetFlags()[2] ? this.eventSource : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.truckId = fieldSetFlags()[3] ? this.truckId : (java.lang.Integer) defaultValue(fields()[3]);
        record.driverId = fieldSetFlags()[4] ? this.driverId : (java.lang.Integer) defaultValue(fields()[4]);
        record.driverName = fieldSetFlags()[5] ? this.driverName : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.routeId = fieldSetFlags()[6] ? this.routeId : (java.lang.Integer) defaultValue(fields()[6]);
        record.route = fieldSetFlags()[7] ? this.route : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.eventType = fieldSetFlags()[8] ? this.eventType : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.latitude = fieldSetFlags()[9] ? this.latitude : (java.lang.Double) defaultValue(fields()[9]);
        record.longitude = fieldSetFlags()[10] ? this.longitude : (java.lang.Double) defaultValue(fields()[10]);
        record.correlationId = fieldSetFlags()[11] ? this.correlationId : (java.lang.Long) defaultValue(fields()[11]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TruckGeoEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<TruckGeoEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TruckGeoEvent>
    READER$ = (org.apache.avro.io.DatumReader<TruckGeoEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
