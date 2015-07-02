/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gpstouch.gts.backend.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mihai
 */
@Entity
@Table(name = "EventData")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EventData.findAll", query = "SELECT e FROM EventData e"),
    @NamedQuery(name = "EventData.findByAccountID", query = "SELECT e FROM EventData e WHERE e.eventDataPK.accountID = :accountID"),
    @NamedQuery(name = "EventData.findByDeviceID", query = "SELECT e FROM EventData e WHERE e.eventDataPK.deviceID = :deviceID"),
    @NamedQuery(name = "EventData.findByTimestamp", query = "SELECT e FROM EventData e WHERE e.eventDataPK.timestamp = :timestamp"),
    @NamedQuery(name = "EventData.findByStatusCode", query = "SELECT e FROM EventData e WHERE e.eventDataPK.statusCode = :statusCode"),
    @NamedQuery(name = "EventData.findByLatitude", query = "SELECT e FROM EventData e WHERE e.latitude = :latitude"),
    @NamedQuery(name = "EventData.findByLongitude", query = "SELECT e FROM EventData e WHERE e.longitude = :longitude"),
    @NamedQuery(name = "EventData.findByGpsAge", query = "SELECT e FROM EventData e WHERE e.gpsAge = :gpsAge"),
    @NamedQuery(name = "EventData.findBySpeedKPH", query = "SELECT e FROM EventData e WHERE e.speedKPH = :speedKPH"),
    @NamedQuery(name = "EventData.findByHeading", query = "SELECT e FROM EventData e WHERE e.heading = :heading"),
    @NamedQuery(name = "EventData.findByAltitude", query = "SELECT e FROM EventData e WHERE e.altitude = :altitude"),
    @NamedQuery(name = "EventData.findByTransportID", query = "SELECT e FROM EventData e WHERE e.transportID = :transportID"),
    @NamedQuery(name = "EventData.findByInputMask", query = "SELECT e FROM EventData e WHERE e.inputMask = :inputMask"),
    @NamedQuery(name = "EventData.findByAddress", query = "SELECT e FROM EventData e WHERE e.address = :address"),
    @NamedQuery(name = "EventData.findByDataSource", query = "SELECT e FROM EventData e WHERE e.dataSource = :dataSource"),
    @NamedQuery(name = "EventData.findByDistanceKM", query = "SELECT e FROM EventData e WHERE e.distanceKM = :distanceKM"),
    @NamedQuery(name = "EventData.findByOdometerKM", query = "SELECT e FROM EventData e WHERE e.odometerKM = :odometerKM"),
    @NamedQuery(name = "EventData.findByGeozoneIndex", query = "SELECT e FROM EventData e WHERE e.geozoneIndex = :geozoneIndex"),
    @NamedQuery(name = "EventData.findByGeozoneID", query = "SELECT e FROM EventData e WHERE e.geozoneID = :geozoneID"),
    @NamedQuery(name = "EventData.findByCreationTime", query = "SELECT e FROM EventData e WHERE e.creationTime = :creationTime"),
    @NamedQuery(name = "EventData.findByStreetAddress", query = "SELECT e FROM EventData e WHERE e.streetAddress = :streetAddress"),
    @NamedQuery(name = "EventData.findByCity", query = "SELECT e FROM EventData e WHERE e.city = :city"),
    @NamedQuery(name = "EventData.findByStateProvince", query = "SELECT e FROM EventData e WHERE e.stateProvince = :stateProvince"),
    @NamedQuery(name = "EventData.findByPostalCode", query = "SELECT e FROM EventData e WHERE e.postalCode = :postalCode"),
    @NamedQuery(name = "EventData.findByCountry", query = "SELECT e FROM EventData e WHERE e.country = :country"),
    @NamedQuery(name = "EventData.findBySubdivision", query = "SELECT e FROM EventData e WHERE e.subdivision = :subdivision"),
    @NamedQuery(name = "EventData.findBySpeedLimitKPH", query = "SELECT e FROM EventData e WHERE e.speedLimitKPH = :speedLimitKPH"),
    @NamedQuery(name = "EventData.findByIsTollRoad", query = "SELECT e FROM EventData e WHERE e.isTollRoad = :isTollRoad"),
    @NamedQuery(name = "EventData.findByThermoAverage0", query = "SELECT e FROM EventData e WHERE e.thermoAverage0 = :thermoAverage0"),
    @NamedQuery(name = "EventData.findByThermoAverage1", query = "SELECT e FROM EventData e WHERE e.thermoAverage1 = :thermoAverage1"),
    @NamedQuery(name = "EventData.findByThermoAverage2", query = "SELECT e FROM EventData e WHERE e.thermoAverage2 = :thermoAverage2"),
    @NamedQuery(name = "EventData.findByThermoAverage3", query = "SELECT e FROM EventData e WHERE e.thermoAverage3 = :thermoAverage3"),
    @NamedQuery(name = "EventData.findByThermoAverage4", query = "SELECT e FROM EventData e WHERE e.thermoAverage4 = :thermoAverage4"),
    @NamedQuery(name = "EventData.findByGpsFixType", query = "SELECT e FROM EventData e WHERE e.gpsFixType = :gpsFixType"),
    @NamedQuery(name = "EventData.findByHorzAccuracy", query = "SELECT e FROM EventData e WHERE e.horzAccuracy = :horzAccuracy"),
    @NamedQuery(name = "EventData.findByVertAccuracy", query = "SELECT e FROM EventData e WHERE e.vertAccuracy = :vertAccuracy"),
    @NamedQuery(name = "EventData.findByHdop", query = "SELECT e FROM EventData e WHERE e.hdop = :hdop"),
    @NamedQuery(name = "EventData.findBySatelliteCount", query = "SELECT e FROM EventData e WHERE e.satelliteCount = :satelliteCount"),
    @NamedQuery(name = "EventData.findByBatteryLevel", query = "SELECT e FROM EventData e WHERE e.batteryLevel = :batteryLevel"),
    @NamedQuery(name = "EventData.findBySignalStrength", query = "SELECT e FROM EventData e WHERE e.signalStrength = :signalStrength"),
    @NamedQuery(name = "EventData.findByBatteryVolts", query = "SELECT e FROM EventData e WHERE e.batteryVolts = :batteryVolts"),
    @NamedQuery(name = "EventData.findByFuelPressure", query = "SELECT e FROM EventData e WHERE e.fuelPressure = :fuelPressure"),
    @NamedQuery(name = "EventData.findByFuelUsage", query = "SELECT e FROM EventData e WHERE e.fuelUsage = :fuelUsage"),
    @NamedQuery(name = "EventData.findByFuelTemp", query = "SELECT e FROM EventData e WHERE e.fuelTemp = :fuelTemp"),
    @NamedQuery(name = "EventData.findByFuelLevel", query = "SELECT e FROM EventData e WHERE e.fuelLevel = :fuelLevel"),
    @NamedQuery(name = "EventData.findByFuelEconomy", query = "SELECT e FROM EventData e WHERE e.fuelEconomy = :fuelEconomy"),
    @NamedQuery(name = "EventData.findByFuelTotal", query = "SELECT e FROM EventData e WHERE e.fuelTotal = :fuelTotal"),
    @NamedQuery(name = "EventData.findByFuelIdle", query = "SELECT e FROM EventData e WHERE e.fuelIdle = :fuelIdle"),
    @NamedQuery(name = "EventData.findByFuelPTO", query = "SELECT e FROM EventData e WHERE e.fuelPTO = :fuelPTO"),
    @NamedQuery(name = "EventData.findByEngineRpm", query = "SELECT e FROM EventData e WHERE e.engineRpm = :engineRpm"),
    @NamedQuery(name = "EventData.findByEngineHours", query = "SELECT e FROM EventData e WHERE e.engineHours = :engineHours"),
    @NamedQuery(name = "EventData.findByEngineLoad", query = "SELECT e FROM EventData e WHERE e.engineLoad = :engineLoad"),
    @NamedQuery(name = "EventData.findByEngineTorque", query = "SELECT e FROM EventData e WHERE e.engineTorque = :engineTorque"),
    @NamedQuery(name = "EventData.findByIdleHours", query = "SELECT e FROM EventData e WHERE e.idleHours = :idleHours"),
    @NamedQuery(name = "EventData.findByTransOilTemp", query = "SELECT e FROM EventData e WHERE e.transOilTemp = :transOilTemp"),
    @NamedQuery(name = "EventData.findByCoolantLevel", query = "SELECT e FROM EventData e WHERE e.coolantLevel = :coolantLevel"),
    @NamedQuery(name = "EventData.findByCoolantTemp", query = "SELECT e FROM EventData e WHERE e.coolantTemp = :coolantTemp"),
    @NamedQuery(name = "EventData.findByIntakeTemp", query = "SELECT e FROM EventData e WHERE e.intakeTemp = :intakeTemp"),
    @NamedQuery(name = "EventData.findByBrakeGForce", query = "SELECT e FROM EventData e WHERE e.brakeGForce = :brakeGForce"),
    @NamedQuery(name = "EventData.findByAcceleration", query = "SELECT e FROM EventData e WHERE e.acceleration = :acceleration"),
    @NamedQuery(name = "EventData.findByBrakePressure", query = "SELECT e FROM EventData e WHERE e.brakePressure = :brakePressure"),
    @NamedQuery(name = "EventData.findByOilPressure", query = "SELECT e FROM EventData e WHERE e.oilPressure = :oilPressure"),
    @NamedQuery(name = "EventData.findByOilLevel", query = "SELECT e FROM EventData e WHERE e.oilLevel = :oilLevel"),
    @NamedQuery(name = "EventData.findByOilTemp", query = "SELECT e FROM EventData e WHERE e.oilTemp = :oilTemp"),
    @NamedQuery(name = "EventData.findByAirPressure", query = "SELECT e FROM EventData e WHERE e.airPressure = :airPressure"),
    @NamedQuery(name = "EventData.findByAirFilterPressure", query = "SELECT e FROM EventData e WHERE e.airFilterPressure = :airFilterPressure"),
    @NamedQuery(name = "EventData.findByPtoEngaged", query = "SELECT e FROM EventData e WHERE e.ptoEngaged = :ptoEngaged"),
    @NamedQuery(name = "EventData.findByPtoHours", query = "SELECT e FROM EventData e WHERE e.ptoHours = :ptoHours"),
    @NamedQuery(name = "EventData.findByThrottlePos", query = "SELECT e FROM EventData e WHERE e.throttlePos = :throttlePos"),
    @NamedQuery(name = "EventData.findByBrakePos", query = "SELECT e FROM EventData e WHERE e.brakePos = :brakePos"),
    @NamedQuery(name = "EventData.findByVBatteryVolts", query = "SELECT e FROM EventData e WHERE e.vBatteryVolts = :vBatteryVolts"),
    @NamedQuery(name = "EventData.findByJ1708Fault", query = "SELECT e FROM EventData e WHERE e.j1708Fault = :j1708Fault"),
    @NamedQuery(name = "EventData.findByFaultCode", query = "SELECT e FROM EventData e WHERE e.faultCode = :faultCode"),
    @NamedQuery(name = "EventData.findByWorkHours", query = "SELECT e FROM EventData e WHERE e.workHours = :workHours"),
    @NamedQuery(name = "EventData.findByTirePressure", query = "SELECT e FROM EventData e WHERE e.tirePressure = :tirePressure"),
    @NamedQuery(name = "EventData.findByTireTemp", query = "SELECT e FROM EventData e WHERE e.tireTemp = :tireTemp"),
    @NamedQuery(name = "EventData.findByCellTowerID", query = "SELECT e FROM EventData e WHERE e.cellTowerID = :cellTowerID"),
    @NamedQuery(name = "EventData.findByMobileCountryCode", query = "SELECT e FROM EventData e WHERE e.mobileCountryCode = :mobileCountryCode"),
    @NamedQuery(name = "EventData.findByMobileNetworkCode", query = "SELECT e FROM EventData e WHERE e.mobileNetworkCode = :mobileNetworkCode"),
    @NamedQuery(name = "EventData.findByCellTimingAdvance", query = "SELECT e FROM EventData e WHERE e.cellTimingAdvance = :cellTimingAdvance"),
    @NamedQuery(name = "EventData.findByLocationAreaCode", query = "SELECT e FROM EventData e WHERE e.locationAreaCode = :locationAreaCode"),
    @NamedQuery(name = "EventData.findByCellServingInfo", query = "SELECT e FROM EventData e WHERE e.cellServingInfo = :cellServingInfo"),
    @NamedQuery(name = "EventData.findByCellLatitude", query = "SELECT e FROM EventData e WHERE e.cellLatitude = :cellLatitude"),
    @NamedQuery(name = "EventData.findByCellLongitude", query = "SELECT e FROM EventData e WHERE e.cellLongitude = :cellLongitude"),
    @NamedQuery(name = "EventData.findByCellAccuracy", query = "SELECT e FROM EventData e WHERE e.cellAccuracy = :cellAccuracy"),
    @NamedQuery(name = "EventData.findByCellNeighborInfo0", query = "SELECT e FROM EventData e WHERE e.cellNeighborInfo0 = :cellNeighborInfo0"),
    @NamedQuery(name = "EventData.findByCellNeighborInfo1", query = "SELECT e FROM EventData e WHERE e.cellNeighborInfo1 = :cellNeighborInfo1"),
    @NamedQuery(name = "EventData.findByCellNeighborInfo2", query = "SELECT e FROM EventData e WHERE e.cellNeighborInfo2 = :cellNeighborInfo2"),
    @NamedQuery(name = "EventData.findByCellNeighborInfo3", query = "SELECT e FROM EventData e WHERE e.cellNeighborInfo3 = :cellNeighborInfo3"),
    @NamedQuery(name = "EventData.findByCellNeighborInfo4", query = "SELECT e FROM EventData e WHERE e.cellNeighborInfo4 = :cellNeighborInfo4"),
    @NamedQuery(name = "EventData.findByCellNeighborInfo5", query = "SELECT e FROM EventData e WHERE e.cellNeighborInfo5 = :cellNeighborInfo5"),
    @NamedQuery(name = "EventData.findByTurboPressure", query = "SELECT e FROM EventData e WHERE e.turboPressure = :turboPressure"),
    @NamedQuery(name = "EventData.findByMalfunctionLamp", query = "SELECT e FROM EventData e WHERE e.malfunctionLamp = :malfunctionLamp"),
    @NamedQuery(name = "EventData.findByDayEngineStarts", query = "SELECT e FROM EventData e WHERE e.dayEngineStarts = :dayEngineStarts"),
    @NamedQuery(name = "EventData.findByDayIdleHours", query = "SELECT e FROM EventData e WHERE e.dayIdleHours = :dayIdleHours"),
    @NamedQuery(name = "EventData.findByDayFuelIdle", query = "SELECT e FROM EventData e WHERE e.dayFuelIdle = :dayFuelIdle"),
    @NamedQuery(name = "EventData.findByDayWorkHours", query = "SELECT e FROM EventData e WHERE e.dayWorkHours = :dayWorkHours"),
    @NamedQuery(name = "EventData.findByDayFuelWork", query = "SELECT e FROM EventData e WHERE e.dayFuelWork = :dayFuelWork"),
    @NamedQuery(name = "EventData.findByDayFuelPTO", query = "SELECT e FROM EventData e WHERE e.dayFuelPTO = :dayFuelPTO"),
    @NamedQuery(name = "EventData.findByDayDistanceKM", query = "SELECT e FROM EventData e WHERE e.dayDistanceKM = :dayDistanceKM"),
    @NamedQuery(name = "EventData.findByDayFuelTotal", query = "SELECT e FROM EventData e WHERE e.dayFuelTotal = :dayFuelTotal"),
    @NamedQuery(name = "EventData.findByOutputMask", query = "SELECT e FROM EventData e WHERE e.outputMask = :outputMask"),
    @NamedQuery(name = "EventData.findByEntityID", query = "SELECT e FROM EventData e WHERE e.entityID = :entityID"),
    @NamedQuery(name = "EventData.findByDriverID", query = "SELECT e FROM EventData e WHERE e.driverID = :driverID"),
    @NamedQuery(name = "EventData.findByDriverStatus", query = "SELECT e FROM EventData e WHERE e.driverStatus = :driverStatus"),
    @NamedQuery(name = "EventData.findByDriverMessage", query = "SELECT e FROM EventData e WHERE e.driverMessage = :driverMessage"),
    @NamedQuery(name = "EventData.findBySensorLow", query = "SELECT e FROM EventData e WHERE e.sensorLow = :sensorLow"),
    @NamedQuery(name = "EventData.findBySensorHigh", query = "SELECT e FROM EventData e WHERE e.sensorHigh = :sensorHigh"),
    @NamedQuery(name = "EventData.findByCostCenter", query = "SELECT e FROM EventData e WHERE e.costCenter = :costCenter"),
    @NamedQuery(name = "EventData.findByJobNumber", query = "SELECT e FROM EventData e WHERE e.jobNumber = :jobNumber"),
    @NamedQuery(name = "EventData.findByRfidTag", query = "SELECT e FROM EventData e WHERE e.rfidTag = :rfidTag"),
    @NamedQuery(name = "EventData.findByAttachType", query = "SELECT e FROM EventData e WHERE e.attachType = :attachType"),
    @NamedQuery(name = "EventData.findByAnalog0", query = "SELECT e FROM EventData e WHERE e.analog0 = :analog0"),
    @NamedQuery(name = "EventData.findByAnalog1", query = "SELECT e FROM EventData e WHERE e.analog1 = :analog1"),
    @NamedQuery(name = "EventData.findByAnalog2", query = "SELECT e FROM EventData e WHERE e.analog2 = :analog2"),
    @NamedQuery(name = "EventData.findByAnalog3", query = "SELECT e FROM EventData e WHERE e.analog3 = :analog3"),
    @NamedQuery(name = "EventData.findByPulseCount", query = "SELECT e FROM EventData e WHERE e.pulseCount = :pulseCount"),
    @NamedQuery(name = "EventData.findBySampleIndex", query = "SELECT e FROM EventData e WHERE e.sampleIndex = :sampleIndex"),
    @NamedQuery(name = "EventData.findBySampleID", query = "SELECT e FROM EventData e WHERE e.sampleID = :sampleID"),
    @NamedQuery(name = "EventData.findByFuelEngineOn", query = "SELECT e FROM EventData e WHERE e.fuelEngineOn = :fuelEngineOn"),
    @NamedQuery(name = "EventData.findByEngineOnHours", query = "SELECT e FROM EventData e WHERE e.engineOnHours = :engineOnHours"),
    @NamedQuery(name = "EventData.findByMassAirFlowRate", query = "SELECT e FROM EventData e WHERE e.massAirFlowRate = :massAirFlowRate"),
    @NamedQuery(name = "EventData.findByFuelLevel2", query = "SELECT e FROM EventData e WHERE e.fuelLevel2 = :fuelLevel2"),
    @NamedQuery(name = "EventData.findByFuelTrip", query = "SELECT e FROM EventData e WHERE e.fuelTrip = :fuelTrip"),
    @NamedQuery(name = "EventData.findByTankLevel", query = "SELECT e FROM EventData e WHERE e.tankLevel = :tankLevel"),
    @NamedQuery(name = "EventData.findByCreationMillis", query = "SELECT e FROM EventData e WHERE e.creationMillis = :creationMillis"),
    @NamedQuery(name = "EventData.findByDataPush", query = "SELECT e FROM EventData e WHERE e.dataPush = :dataPush"),
    @NamedQuery(name = "EventData.findByOdometerOffsetKM", query = "SELECT e FROM EventData e WHERE e.odometerOffsetKM = :odometerOffsetKM"),
    @NamedQuery(name = "EventData.findByGpsFixStatus", query = "SELECT e FROM EventData e WHERE e.gpsFixStatus = :gpsFixStatus"),
    @NamedQuery(name = "EventData.findByEtaTimestamp", query = "SELECT e FROM EventData e WHERE e.etaTimestamp = :etaTimestamp"),
    @NamedQuery(name = "EventData.findByEtaUniqueID", query = "SELECT e FROM EventData e WHERE e.etaUniqueID = :etaUniqueID"),
    @NamedQuery(name = "EventData.findByEtaDistanceKM", query = "SELECT e FROM EventData e WHERE e.etaDistanceKM = :etaDistanceKM"),
    @NamedQuery(name = "EventData.findByEtaLatitude", query = "SELECT e FROM EventData e WHERE e.etaLatitude = :etaLatitude"),
    @NamedQuery(name = "EventData.findByEtaLongitude", query = "SELECT e FROM EventData e WHERE e.etaLongitude = :etaLongitude"),
    @NamedQuery(name = "EventData.findByStopID", query = "SELECT e FROM EventData e WHERE e.stopID = :stopID"),
    @NamedQuery(name = "EventData.findByStopStatus", query = "SELECT e FROM EventData e WHERE e.stopStatus = :stopStatus"),
    @NamedQuery(name = "EventData.findByStopIndex", query = "SELECT e FROM EventData e WHERE e.stopIndex = :stopIndex"),
    @NamedQuery(name = "EventData.findByFuelLevelDelta", query = "SELECT e FROM EventData e WHERE e.fuelLevelDelta = :fuelLevelDelta"),
    @NamedQuery(name = "EventData.findByPriority", query = "SELECT e FROM EventData e WHERE e.priority = :priority"),
    @NamedQuery(name = "EventData.findByEntityType", query = "SELECT e FROM EventData e WHERE e.entityType = :entityType"),
    @NamedQuery(name = "EventData.findBySeatbeltMask", query = "SELECT e FROM EventData e WHERE e.seatbeltMask = :seatbeltMask"),
    @NamedQuery(name = "EventData.findByFuelRemain", query = "SELECT e FROM EventData e WHERE e.fuelRemain = :fuelRemain"),
    @NamedQuery(name = "EventData.findByAccelerometerXYZ", query = "SELECT e FROM EventData e WHERE e.accelerometerXYZ = :accelerometerXYZ")})
public class EventData implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EventDataPK eventDataPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "gpsAge")
    private Integer gpsAge;
    @Column(name = "speedKPH")
    private Double speedKPH;
    @Column(name = "heading")
    private Double heading;
    @Column(name = "altitude")
    private Double altitude;
    @Size(max = 32)
    @Column(name = "transportID")
    private String transportID;
    @Column(name = "inputMask")
    private Integer inputMask;
    @Size(max = 90)
    @Column(name = "address")
    private String address;
    @Size(max = 32)
    @Column(name = "dataSource")
    private String dataSource;
    @Lob
    @Size(max = 65535)
    @Column(name = "rawData")
    private String rawData;
    @Column(name = "distanceKM")
    private Double distanceKM;
    @Column(name = "odometerKM")
    private Double odometerKM;
    @Column(name = "geozoneIndex")
    private Integer geozoneIndex;
    @Size(max = 32)
    @Column(name = "geozoneID")
    private String geozoneID;
    @Column(name = "creationTime")
    private Integer creationTime;
    @Size(max = 90)
    @Column(name = "streetAddress")
    private String streetAddress;
    @Size(max = 40)
    @Column(name = "city")
    private String city;
    @Size(max = 40)
    @Column(name = "stateProvince")
    private String stateProvince;
    @Size(max = 16)
    @Column(name = "postalCode")
    private String postalCode;
    @Size(max = 40)
    @Column(name = "country")
    private String country;
    @Size(max = 32)
    @Column(name = "subdivision")
    private String subdivision;
    @Column(name = "speedLimitKPH")
    private Double speedLimitKPH;
    @Column(name = "isTollRoad")
    private Short isTollRoad;
    @Column(name = "thermoAverage0")
    private Double thermoAverage0;
    @Column(name = "thermoAverage1")
    private Double thermoAverage1;
    @Column(name = "thermoAverage2")
    private Double thermoAverage2;
    @Column(name = "thermoAverage3")
    private Double thermoAverage3;
    @Column(name = "thermoAverage4")
    private Double thermoAverage4;
    @Column(name = "gpsFixType")
    private Short gpsFixType;
    @Column(name = "horzAccuracy")
    private Double horzAccuracy;
    @Column(name = "vertAccuracy")
    private Double vertAccuracy;
    @Column(name = "HDOP")
    private Double hdop;
    @Column(name = "satelliteCount")
    private Short satelliteCount;
    @Column(name = "batteryLevel")
    private Double batteryLevel;
    @Column(name = "signalStrength")
    private Double signalStrength;
    @Column(name = "batteryVolts")
    private Double batteryVolts;
    @Column(name = "fuelPressure")
    private Double fuelPressure;
    @Column(name = "fuelUsage")
    private Double fuelUsage;
    @Column(name = "fuelTemp")
    private Double fuelTemp;
    @Column(name = "fuelLevel")
    private Double fuelLevel;
    @Column(name = "fuelEconomy")
    private Double fuelEconomy;
    @Column(name = "fuelTotal")
    private Double fuelTotal;
    @Column(name = "fuelIdle")
    private Double fuelIdle;
    @Column(name = "fuelPTO")
    private Double fuelPTO;
    @Column(name = "engineRpm")
    private Integer engineRpm;
    @Column(name = "engineHours")
    private Double engineHours;
    @Column(name = "engineLoad")
    private Double engineLoad;
    @Column(name = "engineTorque")
    private Double engineTorque;
    @Column(name = "idleHours")
    private Double idleHours;
    @Column(name = "transOilTemp")
    private Double transOilTemp;
    @Column(name = "coolantLevel")
    private Double coolantLevel;
    @Column(name = "coolantTemp")
    private Double coolantTemp;
    @Column(name = "intakeTemp")
    private Double intakeTemp;
    @Column(name = "brakeGForce")
    private Double brakeGForce;
    @Column(name = "acceleration")
    private Double acceleration;
    @Column(name = "brakePressure")
    private Double brakePressure;
    @Column(name = "oilPressure")
    private Double oilPressure;
    @Column(name = "oilLevel")
    private Double oilLevel;
    @Column(name = "oilTemp")
    private Double oilTemp;
    @Column(name = "airPressure")
    private Double airPressure;
    @Column(name = "airFilterPressure")
    private Double airFilterPressure;
    @Column(name = "ptoEngaged")
    private Short ptoEngaged;
    @Column(name = "ptoHours")
    private Double ptoHours;
    @Column(name = "throttlePos")
    private Double throttlePos;
    @Column(name = "brakePos")
    private Double brakePos;
    @Column(name = "vBatteryVolts")
    private Double vBatteryVolts;
    @Column(name = "j1708Fault")
    private BigInteger j1708Fault;
    @Size(max = 96)
    @Column(name = "faultCode")
    private String faultCode;
    @Column(name = "workHours")
    private Double workHours;
    @Size(max = 140)
    @Column(name = "tirePressure")
    private String tirePressure;
    @Size(max = 140)
    @Column(name = "tireTemp")
    private String tireTemp;
    @Column(name = "cellTowerID")
    private Integer cellTowerID;
    @Column(name = "mobileCountryCode")
    private Integer mobileCountryCode;
    @Column(name = "mobileNetworkCode")
    private Integer mobileNetworkCode;
    @Column(name = "cellTimingAdvance")
    private Integer cellTimingAdvance;
    @Column(name = "locationAreaCode")
    private Integer locationAreaCode;
    @Size(max = 80)
    @Column(name = "cellServingInfo")
    private String cellServingInfo;
    @Column(name = "cellLatitude")
    private Double cellLatitude;
    @Column(name = "cellLongitude")
    private Double cellLongitude;
    @Column(name = "cellAccuracy")
    private Double cellAccuracy;
    @Size(max = 80)
    @Column(name = "cellNeighborInfo0")
    private String cellNeighborInfo0;
    @Size(max = 80)
    @Column(name = "cellNeighborInfo1")
    private String cellNeighborInfo1;
    @Size(max = 80)
    @Column(name = "cellNeighborInfo2")
    private String cellNeighborInfo2;
    @Size(max = 80)
    @Column(name = "cellNeighborInfo3")
    private String cellNeighborInfo3;
    @Size(max = 80)
    @Column(name = "cellNeighborInfo4")
    private String cellNeighborInfo4;
    @Size(max = 80)
    @Column(name = "cellNeighborInfo5")
    private String cellNeighborInfo5;
    @Column(name = "turboPressure")
    private Double turboPressure;
    @Column(name = "malfunctionLamp")
    private Short malfunctionLamp;
    @Column(name = "dayEngineStarts")
    private Short dayEngineStarts;
    @Column(name = "dayIdleHours")
    private Double dayIdleHours;
    @Column(name = "dayFuelIdle")
    private Double dayFuelIdle;
    @Column(name = "dayWorkHours")
    private Double dayWorkHours;
    @Column(name = "dayFuelWork")
    private Double dayFuelWork;
    @Column(name = "dayFuelPTO")
    private Double dayFuelPTO;
    @Column(name = "dayDistanceKM")
    private Double dayDistanceKM;
    @Column(name = "dayFuelTotal")
    private Double dayFuelTotal;
    @Column(name = "outputMask")
    private Integer outputMask;
    @Size(max = 32)
    @Column(name = "entityID")
    private String entityID;
    @Size(max = 32)
    @Column(name = "driverID")
    private String driverID;
    @Column(name = "driverStatus")
    private Integer driverStatus;
    @Size(max = 200)
    @Column(name = "driverMessage")
    private String driverMessage;
    @Column(name = "sensorLow")
    private Integer sensorLow;
    @Column(name = "sensorHigh")
    private Integer sensorHigh;
    @Column(name = "costCenter")
    private Integer costCenter;
    @Size(max = 32)
    @Column(name = "jobNumber")
    private String jobNumber;
    @Size(max = 32)
    @Column(name = "rfidTag")
    private String rfidTag;
    @Size(max = 64)
    @Column(name = "attachType")
    private String attachType;
    @Lob
    @Column(name = "attachData")
    private byte[] attachData;
    @Column(name = "analog0")
    private Double analog0;
    @Column(name = "analog1")
    private Double analog1;
    @Column(name = "analog2")
    private Double analog2;
    @Column(name = "analog3")
    private Double analog3;
    @Column(name = "pulseCount")
    private Double pulseCount;
    @Column(name = "sampleIndex")
    private Integer sampleIndex;
    @Size(max = 32)
    @Column(name = "sampleID")
    private String sampleID;
    @Column(name = "fuelEngineOn")
    private Double fuelEngineOn;
    @Column(name = "engineOnHours")
    private Double engineOnHours;
    @Column(name = "massAirFlowRate")
    private Double massAirFlowRate;
    @Column(name = "fuelLevel2")
    private Double fuelLevel2;
    @Column(name = "fuelTrip")
    private Double fuelTrip;
    @Column(name = "tankLevel")
    private Double tankLevel;
    @Column(name = "creationMillis")
    private BigInteger creationMillis;
    @Column(name = "dataPush")
    private Short dataPush;
    @Column(name = "odometerOffsetKM")
    private Double odometerOffsetKM;
    @Column(name = "gpsFixStatus")
    private Integer gpsFixStatus;
    @Column(name = "etaTimestamp")
    private Integer etaTimestamp;
    @Column(name = "etaUniqueID")
    private Integer etaUniqueID;
    @Column(name = "etaDistanceKM")
    private Double etaDistanceKM;
    @Column(name = "etaLatitude")
    private Double etaLatitude;
    @Column(name = "etaLongitude")
    private Double etaLongitude;
    @Column(name = "stopID")
    private Integer stopID;
    @Column(name = "stopStatus")
    private Short stopStatus;
    @Column(name = "stopIndex")
    private Short stopIndex;
    @Column(name = "fuelLevelDelta")
    private Double fuelLevelDelta;
    @Column(name = "priority")
    private Short priority;
    @Column(name = "entityType")
    private Short entityType;
    @Column(name = "seatbeltMask")
    private Integer seatbeltMask;
    @Column(name = "fuelRemain")
    private Double fuelRemain;
    @Size(max = 32)
    @Column(name = "accelerometerXYZ")
    private String accelerometerXYZ;

    public EventData() {
    }

    public EventData(EventDataPK eventDataPK) {
        this.eventDataPK = eventDataPK;
    }

    public EventData(String accountID, String deviceID, int timestamp, int statusCode) {
        this.eventDataPK = new EventDataPK(accountID, deviceID, timestamp, statusCode);
    }

    public EventDataPK getEventDataPK() {
        return eventDataPK;
    }

    public void setEventDataPK(EventDataPK eventDataPK) {
        this.eventDataPK = eventDataPK;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getGpsAge() {
        return gpsAge;
    }

    public void setGpsAge(Integer gpsAge) {
        this.gpsAge = gpsAge;
    }

    public Double getSpeedKPH() {
        return speedKPH;
    }

    public void setSpeedKPH(Double speedKPH) {
        this.speedKPH = speedKPH;
    }

    public Double getHeading() {
        return heading;
    }

    public void setHeading(Double heading) {
        this.heading = heading;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public String getTransportID() {
        return transportID;
    }

    public void setTransportID(String transportID) {
        this.transportID = transportID;
    }

    public Integer getInputMask() {
        return inputMask;
    }

    public void setInputMask(Integer inputMask) {
        this.inputMask = inputMask;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getRawData() {
        return rawData;
    }

    public void setRawData(String rawData) {
        this.rawData = rawData;
    }

    public Double getDistanceKM() {
        return distanceKM;
    }

    public void setDistanceKM(Double distanceKM) {
        this.distanceKM = distanceKM;
    }

    public Double getOdometerKM() {
        return odometerKM;
    }

    public void setOdometerKM(Double odometerKM) {
        this.odometerKM = odometerKM;
    }

    public Integer getGeozoneIndex() {
        return geozoneIndex;
    }

    public void setGeozoneIndex(Integer geozoneIndex) {
        this.geozoneIndex = geozoneIndex;
    }

    public String getGeozoneID() {
        return geozoneID;
    }

    public void setGeozoneID(String geozoneID) {
        this.geozoneID = geozoneID;
    }

    public Integer getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Integer creationTime) {
        this.creationTime = creationTime;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    public Double getSpeedLimitKPH() {
        return speedLimitKPH;
    }

    public void setSpeedLimitKPH(Double speedLimitKPH) {
        this.speedLimitKPH = speedLimitKPH;
    }

    public Short getIsTollRoad() {
        return isTollRoad;
    }

    public void setIsTollRoad(Short isTollRoad) {
        this.isTollRoad = isTollRoad;
    }

    public Double getThermoAverage0() {
        return thermoAverage0;
    }

    public void setThermoAverage0(Double thermoAverage0) {
        this.thermoAverage0 = thermoAverage0;
    }

    public Double getThermoAverage1() {
        return thermoAverage1;
    }

    public void setThermoAverage1(Double thermoAverage1) {
        this.thermoAverage1 = thermoAverage1;
    }

    public Double getThermoAverage2() {
        return thermoAverage2;
    }

    public void setThermoAverage2(Double thermoAverage2) {
        this.thermoAverage2 = thermoAverage2;
    }

    public Double getThermoAverage3() {
        return thermoAverage3;
    }

    public void setThermoAverage3(Double thermoAverage3) {
        this.thermoAverage3 = thermoAverage3;
    }

    public Double getThermoAverage4() {
        return thermoAverage4;
    }

    public void setThermoAverage4(Double thermoAverage4) {
        this.thermoAverage4 = thermoAverage4;
    }

    public Short getGpsFixType() {
        return gpsFixType;
    }

    public void setGpsFixType(Short gpsFixType) {
        this.gpsFixType = gpsFixType;
    }

    public Double getHorzAccuracy() {
        return horzAccuracy;
    }

    public void setHorzAccuracy(Double horzAccuracy) {
        this.horzAccuracy = horzAccuracy;
    }

    public Double getVertAccuracy() {
        return vertAccuracy;
    }

    public void setVertAccuracy(Double vertAccuracy) {
        this.vertAccuracy = vertAccuracy;
    }

    public Double getHdop() {
        return hdop;
    }

    public void setHdop(Double hdop) {
        this.hdop = hdop;
    }

    public Short getSatelliteCount() {
        return satelliteCount;
    }

    public void setSatelliteCount(Short satelliteCount) {
        this.satelliteCount = satelliteCount;
    }

    public Double getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(Double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public Double getSignalStrength() {
        return signalStrength;
    }

    public void setSignalStrength(Double signalStrength) {
        this.signalStrength = signalStrength;
    }

    public Double getBatteryVolts() {
        return batteryVolts;
    }

    public void setBatteryVolts(Double batteryVolts) {
        this.batteryVolts = batteryVolts;
    }

    public Double getFuelPressure() {
        return fuelPressure;
    }

    public void setFuelPressure(Double fuelPressure) {
        this.fuelPressure = fuelPressure;
    }

    public Double getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(Double fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public Double getFuelTemp() {
        return fuelTemp;
    }

    public void setFuelTemp(Double fuelTemp) {
        this.fuelTemp = fuelTemp;
    }

    public Double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(Double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public Double getFuelEconomy() {
        return fuelEconomy;
    }

    public void setFuelEconomy(Double fuelEconomy) {
        this.fuelEconomy = fuelEconomy;
    }

    public Double getFuelTotal() {
        return fuelTotal;
    }

    public void setFuelTotal(Double fuelTotal) {
        this.fuelTotal = fuelTotal;
    }

    public Double getFuelIdle() {
        return fuelIdle;
    }

    public void setFuelIdle(Double fuelIdle) {
        this.fuelIdle = fuelIdle;
    }

    public Double getFuelPTO() {
        return fuelPTO;
    }

    public void setFuelPTO(Double fuelPTO) {
        this.fuelPTO = fuelPTO;
    }

    public Integer getEngineRpm() {
        return engineRpm;
    }

    public void setEngineRpm(Integer engineRpm) {
        this.engineRpm = engineRpm;
    }

    public Double getEngineHours() {
        return engineHours;
    }

    public void setEngineHours(Double engineHours) {
        this.engineHours = engineHours;
    }

    public Double getEngineLoad() {
        return engineLoad;
    }

    public void setEngineLoad(Double engineLoad) {
        this.engineLoad = engineLoad;
    }

    public Double getEngineTorque() {
        return engineTorque;
    }

    public void setEngineTorque(Double engineTorque) {
        this.engineTorque = engineTorque;
    }

    public Double getIdleHours() {
        return idleHours;
    }

    public void setIdleHours(Double idleHours) {
        this.idleHours = idleHours;
    }

    public Double getTransOilTemp() {
        return transOilTemp;
    }

    public void setTransOilTemp(Double transOilTemp) {
        this.transOilTemp = transOilTemp;
    }

    public Double getCoolantLevel() {
        return coolantLevel;
    }

    public void setCoolantLevel(Double coolantLevel) {
        this.coolantLevel = coolantLevel;
    }

    public Double getCoolantTemp() {
        return coolantTemp;
    }

    public void setCoolantTemp(Double coolantTemp) {
        this.coolantTemp = coolantTemp;
    }

    public Double getIntakeTemp() {
        return intakeTemp;
    }

    public void setIntakeTemp(Double intakeTemp) {
        this.intakeTemp = intakeTemp;
    }

    public Double getBrakeGForce() {
        return brakeGForce;
    }

    public void setBrakeGForce(Double brakeGForce) {
        this.brakeGForce = brakeGForce;
    }

    public Double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(Double acceleration) {
        this.acceleration = acceleration;
    }

    public Double getBrakePressure() {
        return brakePressure;
    }

    public void setBrakePressure(Double brakePressure) {
        this.brakePressure = brakePressure;
    }

    public Double getOilPressure() {
        return oilPressure;
    }

    public void setOilPressure(Double oilPressure) {
        this.oilPressure = oilPressure;
    }

    public Double getOilLevel() {
        return oilLevel;
    }

    public void setOilLevel(Double oilLevel) {
        this.oilLevel = oilLevel;
    }

    public Double getOilTemp() {
        return oilTemp;
    }

    public void setOilTemp(Double oilTemp) {
        this.oilTemp = oilTemp;
    }

    public Double getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(Double airPressure) {
        this.airPressure = airPressure;
    }

    public Double getAirFilterPressure() {
        return airFilterPressure;
    }

    public void setAirFilterPressure(Double airFilterPressure) {
        this.airFilterPressure = airFilterPressure;
    }

    public Short getPtoEngaged() {
        return ptoEngaged;
    }

    public void setPtoEngaged(Short ptoEngaged) {
        this.ptoEngaged = ptoEngaged;
    }

    public Double getPtoHours() {
        return ptoHours;
    }

    public void setPtoHours(Double ptoHours) {
        this.ptoHours = ptoHours;
    }

    public Double getThrottlePos() {
        return throttlePos;
    }

    public void setThrottlePos(Double throttlePos) {
        this.throttlePos = throttlePos;
    }

    public Double getBrakePos() {
        return brakePos;
    }

    public void setBrakePos(Double brakePos) {
        this.brakePos = brakePos;
    }

    public Double getVBatteryVolts() {
        return vBatteryVolts;
    }

    public void setVBatteryVolts(Double vBatteryVolts) {
        this.vBatteryVolts = vBatteryVolts;
    }

    public BigInteger getJ1708Fault() {
        return j1708Fault;
    }

    public void setJ1708Fault(BigInteger j1708Fault) {
        this.j1708Fault = j1708Fault;
    }

    public String getFaultCode() {
        return faultCode;
    }

    public void setFaultCode(String faultCode) {
        this.faultCode = faultCode;
    }

    public Double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Double workHours) {
        this.workHours = workHours;
    }

    public String getTirePressure() {
        return tirePressure;
    }

    public void setTirePressure(String tirePressure) {
        this.tirePressure = tirePressure;
    }

    public String getTireTemp() {
        return tireTemp;
    }

    public void setTireTemp(String tireTemp) {
        this.tireTemp = tireTemp;
    }

    public Integer getCellTowerID() {
        return cellTowerID;
    }

    public void setCellTowerID(Integer cellTowerID) {
        this.cellTowerID = cellTowerID;
    }

    public Integer getMobileCountryCode() {
        return mobileCountryCode;
    }

    public void setMobileCountryCode(Integer mobileCountryCode) {
        this.mobileCountryCode = mobileCountryCode;
    }

    public Integer getMobileNetworkCode() {
        return mobileNetworkCode;
    }

    public void setMobileNetworkCode(Integer mobileNetworkCode) {
        this.mobileNetworkCode = mobileNetworkCode;
    }

    public Integer getCellTimingAdvance() {
        return cellTimingAdvance;
    }

    public void setCellTimingAdvance(Integer cellTimingAdvance) {
        this.cellTimingAdvance = cellTimingAdvance;
    }

    public Integer getLocationAreaCode() {
        return locationAreaCode;
    }

    public void setLocationAreaCode(Integer locationAreaCode) {
        this.locationAreaCode = locationAreaCode;
    }

    public String getCellServingInfo() {
        return cellServingInfo;
    }

    public void setCellServingInfo(String cellServingInfo) {
        this.cellServingInfo = cellServingInfo;
    }

    public Double getCellLatitude() {
        return cellLatitude;
    }

    public void setCellLatitude(Double cellLatitude) {
        this.cellLatitude = cellLatitude;
    }

    public Double getCellLongitude() {
        return cellLongitude;
    }

    public void setCellLongitude(Double cellLongitude) {
        this.cellLongitude = cellLongitude;
    }

    public Double getCellAccuracy() {
        return cellAccuracy;
    }

    public void setCellAccuracy(Double cellAccuracy) {
        this.cellAccuracy = cellAccuracy;
    }

    public String getCellNeighborInfo0() {
        return cellNeighborInfo0;
    }

    public void setCellNeighborInfo0(String cellNeighborInfo0) {
        this.cellNeighborInfo0 = cellNeighborInfo0;
    }

    public String getCellNeighborInfo1() {
        return cellNeighborInfo1;
    }

    public void setCellNeighborInfo1(String cellNeighborInfo1) {
        this.cellNeighborInfo1 = cellNeighborInfo1;
    }

    public String getCellNeighborInfo2() {
        return cellNeighborInfo2;
    }

    public void setCellNeighborInfo2(String cellNeighborInfo2) {
        this.cellNeighborInfo2 = cellNeighborInfo2;
    }

    public String getCellNeighborInfo3() {
        return cellNeighborInfo3;
    }

    public void setCellNeighborInfo3(String cellNeighborInfo3) {
        this.cellNeighborInfo3 = cellNeighborInfo3;
    }

    public String getCellNeighborInfo4() {
        return cellNeighborInfo4;
    }

    public void setCellNeighborInfo4(String cellNeighborInfo4) {
        this.cellNeighborInfo4 = cellNeighborInfo4;
    }

    public String getCellNeighborInfo5() {
        return cellNeighborInfo5;
    }

    public void setCellNeighborInfo5(String cellNeighborInfo5) {
        this.cellNeighborInfo5 = cellNeighborInfo5;
    }

    public Double getTurboPressure() {
        return turboPressure;
    }

    public void setTurboPressure(Double turboPressure) {
        this.turboPressure = turboPressure;
    }

    public Short getMalfunctionLamp() {
        return malfunctionLamp;
    }

    public void setMalfunctionLamp(Short malfunctionLamp) {
        this.malfunctionLamp = malfunctionLamp;
    }

    public Short getDayEngineStarts() {
        return dayEngineStarts;
    }

    public void setDayEngineStarts(Short dayEngineStarts) {
        this.dayEngineStarts = dayEngineStarts;
    }

    public Double getDayIdleHours() {
        return dayIdleHours;
    }

    public void setDayIdleHours(Double dayIdleHours) {
        this.dayIdleHours = dayIdleHours;
    }

    public Double getDayFuelIdle() {
        return dayFuelIdle;
    }

    public void setDayFuelIdle(Double dayFuelIdle) {
        this.dayFuelIdle = dayFuelIdle;
    }

    public Double getDayWorkHours() {
        return dayWorkHours;
    }

    public void setDayWorkHours(Double dayWorkHours) {
        this.dayWorkHours = dayWorkHours;
    }

    public Double getDayFuelWork() {
        return dayFuelWork;
    }

    public void setDayFuelWork(Double dayFuelWork) {
        this.dayFuelWork = dayFuelWork;
    }

    public Double getDayFuelPTO() {
        return dayFuelPTO;
    }

    public void setDayFuelPTO(Double dayFuelPTO) {
        this.dayFuelPTO = dayFuelPTO;
    }

    public Double getDayDistanceKM() {
        return dayDistanceKM;
    }

    public void setDayDistanceKM(Double dayDistanceKM) {
        this.dayDistanceKM = dayDistanceKM;
    }

    public Double getDayFuelTotal() {
        return dayFuelTotal;
    }

    public void setDayFuelTotal(Double dayFuelTotal) {
        this.dayFuelTotal = dayFuelTotal;
    }

    public Integer getOutputMask() {
        return outputMask;
    }

    public void setOutputMask(Integer outputMask) {
        this.outputMask = outputMask;
    }

    public String getEntityID() {
        return entityID;
    }

    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public Integer getDriverStatus() {
        return driverStatus;
    }

    public void setDriverStatus(Integer driverStatus) {
        this.driverStatus = driverStatus;
    }

    public String getDriverMessage() {
        return driverMessage;
    }

    public void setDriverMessage(String driverMessage) {
        this.driverMessage = driverMessage;
    }

    public Integer getSensorLow() {
        return sensorLow;
    }

    public void setSensorLow(Integer sensorLow) {
        this.sensorLow = sensorLow;
    }

    public Integer getSensorHigh() {
        return sensorHigh;
    }

    public void setSensorHigh(Integer sensorHigh) {
        this.sensorHigh = sensorHigh;
    }

    public Integer getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(Integer costCenter) {
        this.costCenter = costCenter;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getRfidTag() {
        return rfidTag;
    }

    public void setRfidTag(String rfidTag) {
        this.rfidTag = rfidTag;
    }

    public String getAttachType() {
        return attachType;
    }

    public void setAttachType(String attachType) {
        this.attachType = attachType;
    }

    public byte[] getAttachData() {
        return attachData;
    }

    public void setAttachData(byte[] attachData) {
        this.attachData = attachData;
    }

    public Double getAnalog0() {
        return analog0;
    }

    public void setAnalog0(Double analog0) {
        this.analog0 = analog0;
    }

    public Double getAnalog1() {
        return analog1;
    }

    public void setAnalog1(Double analog1) {
        this.analog1 = analog1;
    }

    public Double getAnalog2() {
        return analog2;
    }

    public void setAnalog2(Double analog2) {
        this.analog2 = analog2;
    }

    public Double getAnalog3() {
        return analog3;
    }

    public void setAnalog3(Double analog3) {
        this.analog3 = analog3;
    }

    public Double getPulseCount() {
        return pulseCount;
    }

    public void setPulseCount(Double pulseCount) {
        this.pulseCount = pulseCount;
    }

    public Integer getSampleIndex() {
        return sampleIndex;
    }

    public void setSampleIndex(Integer sampleIndex) {
        this.sampleIndex = sampleIndex;
    }

    public String getSampleID() {
        return sampleID;
    }

    public void setSampleID(String sampleID) {
        this.sampleID = sampleID;
    }

    public Double getFuelEngineOn() {
        return fuelEngineOn;
    }

    public void setFuelEngineOn(Double fuelEngineOn) {
        this.fuelEngineOn = fuelEngineOn;
    }

    public Double getEngineOnHours() {
        return engineOnHours;
    }

    public void setEngineOnHours(Double engineOnHours) {
        this.engineOnHours = engineOnHours;
    }

    public Double getMassAirFlowRate() {
        return massAirFlowRate;
    }

    public void setMassAirFlowRate(Double massAirFlowRate) {
        this.massAirFlowRate = massAirFlowRate;
    }

    public Double getFuelLevel2() {
        return fuelLevel2;
    }

    public void setFuelLevel2(Double fuelLevel2) {
        this.fuelLevel2 = fuelLevel2;
    }

    public Double getFuelTrip() {
        return fuelTrip;
    }

    public void setFuelTrip(Double fuelTrip) {
        this.fuelTrip = fuelTrip;
    }

    public Double getTankLevel() {
        return tankLevel;
    }

    public void setTankLevel(Double tankLevel) {
        this.tankLevel = tankLevel;
    }

    public BigInteger getCreationMillis() {
        return creationMillis;
    }

    public void setCreationMillis(BigInteger creationMillis) {
        this.creationMillis = creationMillis;
    }

    public Short getDataPush() {
        return dataPush;
    }

    public void setDataPush(Short dataPush) {
        this.dataPush = dataPush;
    }

    public Double getOdometerOffsetKM() {
        return odometerOffsetKM;
    }

    public void setOdometerOffsetKM(Double odometerOffsetKM) {
        this.odometerOffsetKM = odometerOffsetKM;
    }

    public Integer getGpsFixStatus() {
        return gpsFixStatus;
    }

    public void setGpsFixStatus(Integer gpsFixStatus) {
        this.gpsFixStatus = gpsFixStatus;
    }

    public Integer getEtaTimestamp() {
        return etaTimestamp;
    }

    public void setEtaTimestamp(Integer etaTimestamp) {
        this.etaTimestamp = etaTimestamp;
    }

    public Integer getEtaUniqueID() {
        return etaUniqueID;
    }

    public void setEtaUniqueID(Integer etaUniqueID) {
        this.etaUniqueID = etaUniqueID;
    }

    public Double getEtaDistanceKM() {
        return etaDistanceKM;
    }

    public void setEtaDistanceKM(Double etaDistanceKM) {
        this.etaDistanceKM = etaDistanceKM;
    }

    public Double getEtaLatitude() {
        return etaLatitude;
    }

    public void setEtaLatitude(Double etaLatitude) {
        this.etaLatitude = etaLatitude;
    }

    public Double getEtaLongitude() {
        return etaLongitude;
    }

    public void setEtaLongitude(Double etaLongitude) {
        this.etaLongitude = etaLongitude;
    }

    public Integer getStopID() {
        return stopID;
    }

    public void setStopID(Integer stopID) {
        this.stopID = stopID;
    }

    public Short getStopStatus() {
        return stopStatus;
    }

    public void setStopStatus(Short stopStatus) {
        this.stopStatus = stopStatus;
    }

    public Short getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(Short stopIndex) {
        this.stopIndex = stopIndex;
    }

    public Double getFuelLevelDelta() {
        return fuelLevelDelta;
    }

    public void setFuelLevelDelta(Double fuelLevelDelta) {
        this.fuelLevelDelta = fuelLevelDelta;
    }

    public Short getPriority() {
        return priority;
    }

    public void setPriority(Short priority) {
        this.priority = priority;
    }

    public Short getEntityType() {
        return entityType;
    }

    public void setEntityType(Short entityType) {
        this.entityType = entityType;
    }

    public Integer getSeatbeltMask() {
        return seatbeltMask;
    }

    public void setSeatbeltMask(Integer seatbeltMask) {
        this.seatbeltMask = seatbeltMask;
    }

    public Double getFuelRemain() {
        return fuelRemain;
    }

    public void setFuelRemain(Double fuelRemain) {
        this.fuelRemain = fuelRemain;
    }

    public String getAccelerometerXYZ() {
        return accelerometerXYZ;
    }

    public void setAccelerometerXYZ(String accelerometerXYZ) {
        this.accelerometerXYZ = accelerometerXYZ;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventDataPK != null ? eventDataPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EventData)) {
            return false;
        }
        EventData other = (EventData) object;
        if ((this.eventDataPK == null && other.eventDataPK != null) || (this.eventDataPK != null && !this.eventDataPK.equals(other.eventDataPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.EventData[ eventDataPK=" + eventDataPK + " ]";
    }

}
