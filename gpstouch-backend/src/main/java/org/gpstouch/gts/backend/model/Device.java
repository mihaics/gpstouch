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
@Table(name = "Device")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Device.findAll", query = "SELECT d FROM Device d"),
    @NamedQuery(name = "Device.findByAccountID", query = "SELECT d FROM Device d WHERE d.devicePK.accountID = :accountID"),
    @NamedQuery(name = "Device.findByDeviceID", query = "SELECT d FROM Device d WHERE d.devicePK.deviceID = :deviceID"),
    @NamedQuery(name = "Device.findByGroupID", query = "SELECT d FROM Device d WHERE d.groupID = :groupID"),
    @NamedQuery(name = "Device.findByEquipmentType", query = "SELECT d FROM Device d WHERE d.equipmentType = :equipmentType"),
    @NamedQuery(name = "Device.findByVehicleID", query = "SELECT d FROM Device d WHERE d.vehicleID = :vehicleID"),
    @NamedQuery(name = "Device.findByLicensePlate", query = "SELECT d FROM Device d WHERE d.licensePlate = :licensePlate"),
    @NamedQuery(name = "Device.findByDriverID", query = "SELECT d FROM Device d WHERE d.driverID = :driverID"),
    @NamedQuery(name = "Device.findByFuelCapacity", query = "SELECT d FROM Device d WHERE d.fuelCapacity = :fuelCapacity"),
    @NamedQuery(name = "Device.findByExpirationTime", query = "SELECT d FROM Device d WHERE d.expirationTime = :expirationTime"),
    @NamedQuery(name = "Device.findByUniqueID", query = "SELECT d FROM Device d WHERE d.uniqueID = :uniqueID"),
    @NamedQuery(name = "Device.findByDeviceCode", query = "SELECT d FROM Device d WHERE d.deviceCode = :deviceCode"),
    @NamedQuery(name = "Device.findByDeviceType", query = "SELECT d FROM Device d WHERE d.deviceType = :deviceType"),
    @NamedQuery(name = "Device.findByPushpinID", query = "SELECT d FROM Device d WHERE d.pushpinID = :pushpinID"),
    @NamedQuery(name = "Device.findByDisplayColor", query = "SELECT d FROM Device d WHERE d.displayColor = :displayColor"),
    @NamedQuery(name = "Device.findBySerialNumber", query = "SELECT d FROM Device d WHERE d.serialNumber = :serialNumber"),
    @NamedQuery(name = "Device.findBySimPhoneNumber", query = "SELECT d FROM Device d WHERE d.simPhoneNumber = :simPhoneNumber"),
    @NamedQuery(name = "Device.findBySmsEmail", query = "SELECT d FROM Device d WHERE d.smsEmail = :smsEmail"),
    @NamedQuery(name = "Device.findByImeiNumber", query = "SELECT d FROM Device d WHERE d.imeiNumber = :imeiNumber"),
    @NamedQuery(name = "Device.findByIgnitionIndex", query = "SELECT d FROM Device d WHERE d.ignitionIndex = :ignitionIndex"),
    @NamedQuery(name = "Device.findByCodeVersion", query = "SELECT d FROM Device d WHERE d.codeVersion = :codeVersion"),
    @NamedQuery(name = "Device.findByFeatureSet", query = "SELECT d FROM Device d WHERE d.featureSet = :featureSet"),
    @NamedQuery(name = "Device.findByIpAddressValid", query = "SELECT d FROM Device d WHERE d.ipAddressValid = :ipAddressValid"),
    @NamedQuery(name = "Device.findByLastTotalConnectTime", query = "SELECT d FROM Device d WHERE d.lastTotalConnectTime = :lastTotalConnectTime"),
    @NamedQuery(name = "Device.findByLastDuplexConnectTime", query = "SELECT d FROM Device d WHERE d.lastDuplexConnectTime = :lastDuplexConnectTime"),
    @NamedQuery(name = "Device.findByLastPingTime", query = "SELECT d FROM Device d WHERE d.lastPingTime = :lastPingTime"),
    @NamedQuery(name = "Device.findByTotalPingCount", query = "SELECT d FROM Device d WHERE d.totalPingCount = :totalPingCount"),
    @NamedQuery(name = "Device.findByMaxPingCount", query = "SELECT d FROM Device d WHERE d.maxPingCount = :maxPingCount"),
    @NamedQuery(name = "Device.findByExpectAck", query = "SELECT d FROM Device d WHERE d.expectAck = :expectAck"),
    @NamedQuery(name = "Device.findByLastAckTime", query = "SELECT d FROM Device d WHERE d.lastAckTime = :lastAckTime"),
    @NamedQuery(name = "Device.findByDcsConfigMask", query = "SELECT d FROM Device d WHERE d.dcsConfigMask = :dcsConfigMask"),
    @NamedQuery(name = "Device.findBySupportsDMTP", query = "SELECT d FROM Device d WHERE d.supportsDMTP = :supportsDMTP"),
    @NamedQuery(name = "Device.findBySupportedEncodings", query = "SELECT d FROM Device d WHERE d.supportedEncodings = :supportedEncodings"),
    @NamedQuery(name = "Device.findByUnitLimitInterval", query = "SELECT d FROM Device d WHERE d.unitLimitInterval = :unitLimitInterval"),
    @NamedQuery(name = "Device.findByMaxAllowedEvents", query = "SELECT d FROM Device d WHERE d.maxAllowedEvents = :maxAllowedEvents"),
    @NamedQuery(name = "Device.findByTotalMaxConn", query = "SELECT d FROM Device d WHERE d.totalMaxConn = :totalMaxConn"),
    @NamedQuery(name = "Device.findByTotalMaxConnPerMin", query = "SELECT d FROM Device d WHERE d.totalMaxConnPerMin = :totalMaxConnPerMin"),
    @NamedQuery(name = "Device.findByDuplexMaxConn", query = "SELECT d FROM Device d WHERE d.duplexMaxConn = :duplexMaxConn"),
    @NamedQuery(name = "Device.findByDuplexMaxConnPerMin", query = "SELECT d FROM Device d WHERE d.duplexMaxConnPerMin = :duplexMaxConnPerMin"),
    @NamedQuery(name = "Device.findByIpAddressCurrent", query = "SELECT d FROM Device d WHERE d.ipAddressCurrent = :ipAddressCurrent"),
    @NamedQuery(name = "Device.findByRemotePortCurrent", query = "SELECT d FROM Device d WHERE d.remotePortCurrent = :remotePortCurrent"),
    @NamedQuery(name = "Device.findByListenPortCurrent", query = "SELECT d FROM Device d WHERE d.listenPortCurrent = :listenPortCurrent"),
    @NamedQuery(name = "Device.findByLastInputState", query = "SELECT d FROM Device d WHERE d.lastInputState = :lastInputState"),
    @NamedQuery(name = "Device.findByLastBatteryLevel", query = "SELECT d FROM Device d WHERE d.lastBatteryLevel = :lastBatteryLevel"),
    @NamedQuery(name = "Device.findByLastValidLatitude", query = "SELECT d FROM Device d WHERE d.lastValidLatitude = :lastValidLatitude"),
    @NamedQuery(name = "Device.findByLastValidLongitude", query = "SELECT d FROM Device d WHERE d.lastValidLongitude = :lastValidLongitude"),
    @NamedQuery(name = "Device.findByLastGPSTimestamp", query = "SELECT d FROM Device d WHERE d.lastGPSTimestamp = :lastGPSTimestamp"),
    @NamedQuery(name = "Device.findByLastOdometerKM", query = "SELECT d FROM Device d WHERE d.lastOdometerKM = :lastOdometerKM"),
    @NamedQuery(name = "Device.findByOdometerOffsetKM", query = "SELECT d FROM Device d WHERE d.odometerOffsetKM = :odometerOffsetKM"),
    @NamedQuery(name = "Device.findByIsActive", query = "SELECT d FROM Device d WHERE d.isActive = :isActive"),
    @NamedQuery(name = "Device.findByDisplayName", query = "SELECT d FROM Device d WHERE d.displayName = :displayName"),
    @NamedQuery(name = "Device.findByDescription", query = "SELECT d FROM Device d WHERE d.description = :description"),
    @NamedQuery(name = "Device.findByLastUpdateTime", query = "SELECT d FROM Device d WHERE d.lastUpdateTime = :lastUpdateTime"),
    @NamedQuery(name = "Device.findByCreationTime", query = "SELECT d FROM Device d WHERE d.creationTime = :creationTime"),
    @NamedQuery(name = "Device.findByLastFuelLevel", query = "SELECT d FROM Device d WHERE d.lastFuelLevel = :lastFuelLevel"),
    @NamedQuery(name = "Device.findBySpeedLimitKPH", query = "SELECT d FROM Device d WHERE d.speedLimitKPH = :speedLimitKPH"),
    @NamedQuery(name = "Device.findByLastOilLevel", query = "SELECT d FROM Device d WHERE d.lastOilLevel = :lastOilLevel"),
    @NamedQuery(name = "Device.findByAllowNotify", query = "SELECT d FROM Device d WHERE d.allowNotify = :allowNotify"),
    @NamedQuery(name = "Device.findByLastNotifyTime", query = "SELECT d FROM Device d WHERE d.lastNotifyTime = :lastNotifyTime"),
    @NamedQuery(name = "Device.findByLastNotifyCode", query = "SELECT d FROM Device d WHERE d.lastNotifyCode = :lastNotifyCode"),
    @NamedQuery(name = "Device.findByNotifyEmail", query = "SELECT d FROM Device d WHERE d.notifyEmail = :notifyEmail"),
    @NamedQuery(name = "Device.findByNotifyAction", query = "SELECT d FROM Device d WHERE d.notifyAction = :notifyAction"),
    @NamedQuery(name = "Device.findByNotifyDescription", query = "SELECT d FROM Device d WHERE d.notifyDescription = :notifyDescription"),
    @NamedQuery(name = "Device.findByNotifyUseWrapper", query = "SELECT d FROM Device d WHERE d.notifyUseWrapper = :notifyUseWrapper"),
    @NamedQuery(name = "Device.findByNotifyPriority", query = "SELECT d FROM Device d WHERE d.notifyPriority = :notifyPriority"),
    @NamedQuery(name = "Device.findByMaintIntervalKM0", query = "SELECT d FROM Device d WHERE d.maintIntervalKM0 = :maintIntervalKM0"),
    @NamedQuery(name = "Device.findByMaintOdometerKM0", query = "SELECT d FROM Device d WHERE d.maintOdometerKM0 = :maintOdometerKM0"),
    @NamedQuery(name = "Device.findByMaintIntervalKM1", query = "SELECT d FROM Device d WHERE d.maintIntervalKM1 = :maintIntervalKM1"),
    @NamedQuery(name = "Device.findByMaintOdometerKM1", query = "SELECT d FROM Device d WHERE d.maintOdometerKM1 = :maintOdometerKM1"),
    @NamedQuery(name = "Device.findByFuelEconomy", query = "SELECT d FROM Device d WHERE d.fuelEconomy = :fuelEconomy"),
    @NamedQuery(name = "Device.findByLastValidHeading", query = "SELECT d FROM Device d WHERE d.lastValidHeading = :lastValidHeading"),
    @NamedQuery(name = "Device.findByLastCellServingInfo", query = "SELECT d FROM Device d WHERE d.lastCellServingInfo = :lastCellServingInfo"),
    @NamedQuery(name = "Device.findByLastEngineHours", query = "SELECT d FROM Device d WHERE d.lastEngineHours = :lastEngineHours"),
    @NamedQuery(name = "Device.findByMaintIntervalHR0", query = "SELECT d FROM Device d WHERE d.maintIntervalHR0 = :maintIntervalHR0"),
    @NamedQuery(name = "Device.findByMaintEngHoursHR0", query = "SELECT d FROM Device d WHERE d.maintEngHoursHR0 = :maintEngHoursHR0"),
    @NamedQuery(name = "Device.findByDcsPropertiesID", query = "SELECT d FROM Device d WHERE d.dcsPropertiesID = :dcsPropertiesID"),
    @NamedQuery(name = "Device.findByLastFuelTotal", query = "SELECT d FROM Device d WHERE d.lastFuelTotal = :lastFuelTotal"),
    @NamedQuery(name = "Device.findByParkedLatitude", query = "SELECT d FROM Device d WHERE d.parkedLatitude = :parkedLatitude"),
    @NamedQuery(name = "Device.findByParkedLongitude", query = "SELECT d FROM Device d WHERE d.parkedLongitude = :parkedLongitude"),
    @NamedQuery(name = "Device.findByParkedRadius", query = "SELECT d FROM Device d WHERE d.parkedRadius = :parkedRadius"),
    @NamedQuery(name = "Device.findByPlanDistanceKM", query = "SELECT d FROM Device d WHERE d.planDistanceKM = :planDistanceKM"),
    @NamedQuery(name = "Device.findByLastIgnitionOnTime", query = "SELECT d FROM Device d WHERE d.lastIgnitionOnTime = :lastIgnitionOnTime"),
    @NamedQuery(name = "Device.findByActiveCorridor", query = "SELECT d FROM Device d WHERE d.activeCorridor = :activeCorridor"),
    @NamedQuery(name = "Device.findByLastIgnitionOffTime", query = "SELECT d FROM Device d WHERE d.lastIgnitionOffTime = :lastIgnitionOffTime"),
    @NamedQuery(name = "Device.findByLastDataPushTime", query = "SELECT d FROM Device d WHERE d.lastDataPushTime = :lastDataPushTime"),
    @NamedQuery(name = "Device.findByLastEventCreateMillis", query = "SELECT d FROM Device d WHERE d.lastEventCreateMillis = :lastEventCreateMillis"),
    @NamedQuery(name = "Device.findByEngineHoursOffset", query = "SELECT d FROM Device d WHERE d.engineHoursOffset = :engineHoursOffset"),
    @NamedQuery(name = "Device.findBySimID", query = "SELECT d FROM Device d WHERE d.simID = :simID"),
    @NamedQuery(name = "Device.findByLastEventTimestamp", query = "SELECT d FROM Device d WHERE d.lastEventTimestamp = :lastEventTimestamp"),
    @NamedQuery(name = "Device.findByLastStopTime", query = "SELECT d FROM Device d WHERE d.lastStopTime = :lastStopTime"),
    @NamedQuery(name = "Device.findByLastStartTime", query = "SELECT d FROM Device d WHERE d.lastStartTime = :lastStartTime"),
    @NamedQuery(name = "Device.findByLastTcpSessionID", query = "SELECT d FROM Device d WHERE d.lastTcpSessionID = :lastTcpSessionID"),
    @NamedQuery(name = "Device.findByLastIgnitionHours", query = "SELECT d FROM Device d WHERE d.lastIgnitionHours = :lastIgnitionHours"),
    @NamedQuery(name = "Device.findByLastMalfunctionLamp", query = "SELECT d FROM Device d WHERE d.lastMalfunctionLamp = :lastMalfunctionLamp"),
    @NamedQuery(name = "Device.findByLastFaultCode", query = "SELECT d FROM Device d WHERE d.lastFaultCode = :lastFaultCode"),
    @NamedQuery(name = "Device.findByWorkOrderID", query = "SELECT d FROM Device d WHERE d.workOrderID = :workOrderID"),
    @NamedQuery(name = "Device.findByJobNumber", query = "SELECT d FROM Device d WHERE d.jobNumber = :jobNumber"),
    @NamedQuery(name = "Device.findByJobLatitude", query = "SELECT d FROM Device d WHERE d.jobLatitude = :jobLatitude"),
    @NamedQuery(name = "Device.findByJobLongitude", query = "SELECT d FROM Device d WHERE d.jobLongitude = :jobLongitude"),
    @NamedQuery(name = "Device.findByJobRadius", query = "SELECT d FROM Device d WHERE d.jobRadius = :jobRadius"),
    @NamedQuery(name = "Device.findByReminderInterval", query = "SELECT d FROM Device d WHERE d.reminderInterval = :reminderInterval"),
    @NamedQuery(name = "Device.findByReminderTime", query = "SELECT d FROM Device d WHERE d.reminderTime = :reminderTime"),
    @NamedQuery(name = "Device.findByLinkURL", query = "SELECT d FROM Device d WHERE d.linkURL = :linkURL"),
    @NamedQuery(name = "Device.findByLinkDescription", query = "SELECT d FROM Device d WHERE d.linkDescription = :linkDescription"),
    @NamedQuery(name = "Device.findByLastNotifyRule", query = "SELECT d FROM Device d WHERE d.lastNotifyRule = :lastNotifyRule"),
    @NamedQuery(name = "Device.findByAssignedUserID", query = "SELECT d FROM Device d WHERE d.assignedUserID = :assignedUserID"),
    @NamedQuery(name = "Device.findByThermalProfile", query = "SELECT d FROM Device d WHERE d.thermalProfile = :thermalProfile"),
    @NamedQuery(name = "Device.findByLastServiceTime", query = "SELECT d FROM Device d WHERE d.lastServiceTime = :lastServiceTime"),
    @NamedQuery(name = "Device.findByNextServiceTime", query = "SELECT d FROM Device d WHERE d.nextServiceTime = :nextServiceTime"),
    @NamedQuery(name = "Device.findByExpectAckCode", query = "SELECT d FROM Device d WHERE d.expectAckCode = :expectAckCode"),
    @NamedQuery(name = "Device.findByDcsCommandHost", query = "SELECT d FROM Device d WHERE d.dcsCommandHost = :dcsCommandHost"),
    @NamedQuery(name = "Device.findByMaxVfuelprobe", query = "SELECT d FROM Device d WHERE d.maxVfuelprobe = :maxVfuelprobe"),
    @NamedQuery(name = "Device.findByMinVfuelprobe", query = "SELECT d FROM Device d WHERE d.minVfuelprobe = :minVfuelprobe"),
    @NamedQuery(name = "Device.findByVehicleMake", query = "SELECT d FROM Device d WHERE d.vehicleMake = :vehicleMake"),
    @NamedQuery(name = "Device.findByVehicleModel", query = "SELECT d FROM Device d WHERE d.vehicleModel = :vehicleModel"),
    @NamedQuery(name = "Device.findByDriverStatus", query = "SELECT d FROM Device d WHERE d.driverStatus = :driverStatus"),
    @NamedQuery(name = "Device.findByInstallTime", query = "SELECT d FROM Device d WHERE d.installTime = :installTime"),
    @NamedQuery(name = "Device.findByResetTime", query = "SELECT d FROM Device d WHERE d.resetTime = :resetTime"),
    @NamedQuery(name = "Device.findByCommandStateMask", query = "SELECT d FROM Device d WHERE d.commandStateMask = :commandStateMask"),
    @NamedQuery(name = "Device.findByLastOutputState", query = "SELECT d FROM Device d WHERE d.lastOutputState = :lastOutputState"),
    @NamedQuery(name = "Device.findByLastDistanceKM", query = "SELECT d FROM Device d WHERE d.lastDistanceKM = :lastDistanceKM"),
    @NamedQuery(name = "Device.findByHoursOfOperation", query = "SELECT d FROM Device d WHERE d.hoursOfOperation = :hoursOfOperation"),
    @NamedQuery(name = "Device.findByEquipmentStatus", query = "SELECT d FROM Device d WHERE d.equipmentStatus = :equipmentStatus"),
    @NamedQuery(name = "Device.findByLicenseExpire", query = "SELECT d FROM Device d WHERE d.licenseExpire = :licenseExpire"),
    @NamedQuery(name = "Device.findByFuelRatePerHour", query = "SELECT d FROM Device d WHERE d.fuelRatePerHour = :fuelRatePerHour"),
    @NamedQuery(name = "Device.findByDcsConfigString", query = "SELECT d FROM Device d WHERE d.dcsConfigString = :dcsConfigString"),
    @NamedQuery(name = "Device.findByStatusCodeState", query = "SELECT d FROM Device d WHERE d.statusCodeState = :statusCodeState"),
    @NamedQuery(name = "Device.findByLastValidSpeedKPH", query = "SELECT d FROM Device d WHERE d.lastValidSpeedKPH = :lastValidSpeedKPH"),
    @NamedQuery(name = "Device.findByLastEngineOnHours", query = "SELECT d FROM Device d WHERE d.lastEngineOnHours = :lastEngineOnHours"),
    @NamedQuery(name = "Device.findByLastEngineOnTime", query = "SELECT d FROM Device d WHERE d.lastEngineOnTime = :lastEngineOnTime"),
    @NamedQuery(name = "Device.findByLastEngineOffTime", query = "SELECT d FROM Device d WHERE d.lastEngineOffTime = :lastEngineOffTime"),
    @NamedQuery(name = "Device.findByLastIgnitionOnHours", query = "SELECT d FROM Device d WHERE d.lastIgnitionOnHours = :lastIgnitionOnHours"),
    @NamedQuery(name = "Device.findByPendingMessage", query = "SELECT d FROM Device d WHERE d.pendingMessage = :pendingMessage"),
    @NamedQuery(name = "Device.findByPendingMessageACK", query = "SELECT d FROM Device d WHERE d.pendingMessageACK = :pendingMessageACK"),
    @NamedQuery(name = "Device.findByLastEventsPerSecond", query = "SELECT d FROM Device d WHERE d.lastEventsPerSecond = :lastEventsPerSecond"),
    @NamedQuery(name = "Device.findByLastEventsPerSecondMS", query = "SELECT d FROM Device d WHERE d.lastEventsPerSecondMS = :lastEventsPerSecondMS")})
public class Device implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DevicePK devicePK;
    @Size(max = 32)
    @Column(name = "groupID")
    private String groupID;
    @Size(max = 40)
    @Column(name = "equipmentType")
    private String equipmentType;
    @Size(max = 24)
    @Column(name = "vehicleID")
    private String vehicleID;
    @Size(max = 24)
    @Column(name = "licensePlate")
    private String licensePlate;
    @Size(max = 32)
    @Column(name = "driverID")
    private String driverID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "fuelCapacity")
    private Double fuelCapacity;
    @Column(name = "expirationTime")
    private Integer expirationTime;
    @Size(max = 40)
    @Column(name = "uniqueID")
    private String uniqueID;
    @Size(max = 24)
    @Column(name = "deviceCode")
    private String deviceCode;
    @Size(max = 24)
    @Column(name = "deviceType")
    private String deviceType;
    @Size(max = 32)
    @Column(name = "pushpinID")
    private String pushpinID;
    @Size(max = 16)
    @Column(name = "displayColor")
    private String displayColor;
    @Size(max = 24)
    @Column(name = "serialNumber")
    private String serialNumber;
    @Size(max = 24)
    @Column(name = "simPhoneNumber")
    private String simPhoneNumber;
    @Size(max = 64)
    @Column(name = "smsEmail")
    private String smsEmail;
    @Size(max = 24)
    @Column(name = "imeiNumber")
    private String imeiNumber;
    @Lob
    @Size(max = 65535)
    @Column(name = "dataKey")
    private String dataKey;
    @Column(name = "ignitionIndex")
    private Short ignitionIndex;
    @Size(max = 32)
    @Column(name = "codeVersion")
    private String codeVersion;
    @Size(max = 64)
    @Column(name = "featureSet")
    private String featureSet;
    @Size(max = 128)
    @Column(name = "ipAddressValid")
    private String ipAddressValid;
    @Column(name = "lastTotalConnectTime")
    private Integer lastTotalConnectTime;
    @Column(name = "lastDuplexConnectTime")
    private Integer lastDuplexConnectTime;
    @Lob
    @Size(max = 65535)
    @Column(name = "pendingPingCommand")
    private String pendingPingCommand;
    @Column(name = "lastPingTime")
    private Integer lastPingTime;
    @Column(name = "totalPingCount")
    private Short totalPingCount;
    @Column(name = "maxPingCount")
    private Short maxPingCount;
    @Column(name = "expectAck")
    private Short expectAck;
    @Lob
    @Size(max = 65535)
    @Column(name = "lastAckCommand")
    private String lastAckCommand;
    @Column(name = "lastAckTime")
    private Integer lastAckTime;
    @Column(name = "dcsConfigMask")
    private Integer dcsConfigMask;
    @Column(name = "supportsDMTP")
    private Short supportsDMTP;
    @Column(name = "supportedEncodings")
    private Short supportedEncodings;
    @Column(name = "unitLimitInterval")
    private Short unitLimitInterval;
    @Column(name = "maxAllowedEvents")
    private Short maxAllowedEvents;
    @Lob
    @Column(name = "totalProfileMask")
    private byte[] totalProfileMask;
    @Column(name = "totalMaxConn")
    private Short totalMaxConn;
    @Column(name = "totalMaxConnPerMin")
    private Short totalMaxConnPerMin;
    @Lob
    @Column(name = "duplexProfileMask")
    private byte[] duplexProfileMask;
    @Column(name = "duplexMaxConn")
    private Short duplexMaxConn;
    @Column(name = "duplexMaxConnPerMin")
    private Short duplexMaxConnPerMin;
    @Size(max = 32)
    @Column(name = "ipAddressCurrent")
    private String ipAddressCurrent;
    @Column(name = "remotePortCurrent")
    private Short remotePortCurrent;
    @Column(name = "listenPortCurrent")
    private Short listenPortCurrent;
    @Column(name = "lastInputState")
    private Integer lastInputState;
    @Column(name = "lastBatteryLevel")
    private Double lastBatteryLevel;
    @Column(name = "lastValidLatitude")
    private Double lastValidLatitude;
    @Column(name = "lastValidLongitude")
    private Double lastValidLongitude;
    @Column(name = "lastGPSTimestamp")
    private Integer lastGPSTimestamp;
    @Column(name = "lastOdometerKM")
    private Double lastOdometerKM;
    @Column(name = "odometerOffsetKM")
    private Double odometerOffsetKM;
    @Column(name = "isActive")
    private Short isActive;
    @Size(max = 40)
    @Column(name = "displayName")
    private String displayName;
    @Size(max = 128)
    @Column(name = "description")
    private String description;
    @Lob
    @Size(max = 65535)
    @Column(name = "notes")
    private String notes;
    @Column(name = "lastUpdateTime")
    private Integer lastUpdateTime;
    @Column(name = "creationTime")
    private Integer creationTime;
    @Column(name = "lastFuelLevel")
    private Double lastFuelLevel;
    @Column(name = "speedLimitKPH")
    private Double speedLimitKPH;
    @Column(name = "lastOilLevel")
    private Double lastOilLevel;
    @Column(name = "allowNotify")
    private Short allowNotify;
    @Column(name = "lastNotifyTime")
    private Integer lastNotifyTime;
    @Column(name = "lastNotifyCode")
    private Integer lastNotifyCode;
    @Size(max = 128)
    @Column(name = "notifyEmail")
    private String notifyEmail;
    @Lob
    @Size(max = 65535)
    @Column(name = "notifySelector")
    private String notifySelector;
    @Column(name = "notifyAction")
    private Integer notifyAction;
    @Size(max = 64)
    @Column(name = "notifyDescription")
    private String notifyDescription;
    @Lob
    @Size(max = 65535)
    @Column(name = "notifySubject")
    private String notifySubject;
    @Lob
    @Size(max = 65535)
    @Column(name = "notifyText")
    private String notifyText;
    @Column(name = "notifyUseWrapper")
    private Short notifyUseWrapper;
    @Column(name = "notifyPriority")
    private Short notifyPriority;
    @Column(name = "maintIntervalKM0")
    private Double maintIntervalKM0;
    @Column(name = "maintOdometerKM0")
    private Double maintOdometerKM0;
    @Column(name = "maintIntervalKM1")
    private Double maintIntervalKM1;
    @Column(name = "maintOdometerKM1")
    private Double maintOdometerKM1;
    @Lob
    @Size(max = 65535)
    @Column(name = "maintNotes")
    private String maintNotes;
    @Column(name = "fuelEconomy")
    private Double fuelEconomy;
    @Column(name = "lastValidHeading")
    private Double lastValidHeading;
    @Size(max = 100)
    @Column(name = "lastCellServingInfo")
    private String lastCellServingInfo;
    @Column(name = "lastEngineHours")
    private Double lastEngineHours;
    @Column(name = "maintIntervalHR0")
    private Double maintIntervalHR0;
    @Column(name = "maintEngHoursHR0")
    private Double maintEngHoursHR0;
    @Size(max = 32)
    @Column(name = "dcsPropertiesID")
    private String dcsPropertiesID;
    @Column(name = "lastFuelTotal")
    private Double lastFuelTotal;
    @Column(name = "parkedLatitude")
    private Double parkedLatitude;
    @Column(name = "parkedLongitude")
    private Double parkedLongitude;
    @Column(name = "parkedRadius")
    private Double parkedRadius;
    @Column(name = "planDistanceKM")
    private Double planDistanceKM;
    @Column(name = "lastIgnitionOnTime")
    private Integer lastIgnitionOnTime;
    @Size(max = 32)
    @Column(name = "activeCorridor")
    private String activeCorridor;
    @Column(name = "lastIgnitionOffTime")
    private Integer lastIgnitionOffTime;
    @Column(name = "lastDataPushTime")
    private Integer lastDataPushTime;
    @Column(name = "lastEventCreateMillis")
    private BigInteger lastEventCreateMillis;
    @Column(name = "engineHoursOffset")
    private Double engineHoursOffset;
    @Size(max = 24)
    @Column(name = "simID")
    private String simID;
    @Column(name = "lastEventTimestamp")
    private Integer lastEventTimestamp;
    @Column(name = "lastStopTime")
    private Integer lastStopTime;
    @Column(name = "lastStartTime")
    private Integer lastStartTime;
    @Size(max = 32)
    @Column(name = "lastTcpSessionID")
    private String lastTcpSessionID;
    @Column(name = "lastIgnitionHours")
    private Double lastIgnitionHours;
    @Column(name = "lastMalfunctionLamp")
    private Short lastMalfunctionLamp;
    @Size(max = 96)
    @Column(name = "lastFaultCode")
    private String lastFaultCode;
    @Size(max = 512)
    @Column(name = "workOrderID")
    private String workOrderID;
    @Size(max = 32)
    @Column(name = "jobNumber")
    private String jobNumber;
    @Column(name = "jobLatitude")
    private Double jobLatitude;
    @Column(name = "jobLongitude")
    private Double jobLongitude;
    @Column(name = "jobRadius")
    private Double jobRadius;
    @Lob
    @Size(max = 65535)
    @Column(name = "customAttributes")
    private String customAttributes;
    @Lob
    @Size(max = 65535)
    @Column(name = "reminderMessage")
    private String reminderMessage;
    @Size(max = 64)
    @Column(name = "reminderInterval")
    private String reminderInterval;
    @Column(name = "reminderTime")
    private Integer reminderTime;
    @Size(max = 128)
    @Column(name = "linkURL")
    private String linkURL;
    @Size(max = 64)
    @Column(name = "linkDescription")
    private String linkDescription;
    @Size(max = 32)
    @Column(name = "lastNotifyRule")
    private String lastNotifyRule;
    @Size(max = 32)
    @Column(name = "assignedUserID")
    private String assignedUserID;
    @Size(max = 200)
    @Column(name = "thermalProfile")
    private String thermalProfile;
    @Column(name = "lastServiceTime")
    private Integer lastServiceTime;
    @Column(name = "nextServiceTime")
    private Integer nextServiceTime;
    @Column(name = "expectAckCode")
    private Integer expectAckCode;
    @Size(max = 32)
    @Column(name = "dcsCommandHost")
    private String dcsCommandHost;
    @Column(name = "maxVfuelprobe")
    private Double maxVfuelprobe;
    @Column(name = "minVfuelprobe")
    private Double minVfuelprobe;
    @Size(max = 40)
    @Column(name = "vehicleMake")
    private String vehicleMake;
    @Size(max = 40)
    @Column(name = "vehicleModel")
    private String vehicleModel;
    @Column(name = "driverStatus")
    private Integer driverStatus;
    @Column(name = "installTime")
    private Integer installTime;
    @Column(name = "resetTime")
    private Integer resetTime;
    @Column(name = "commandStateMask")
    private Integer commandStateMask;
    @Column(name = "lastOutputState")
    private Integer lastOutputState;
    @Column(name = "lastDistanceKM")
    private Double lastDistanceKM;
    @Size(max = 200)
    @Column(name = "hoursOfOperation")
    private String hoursOfOperation;
    @Size(max = 24)
    @Column(name = "equipmentStatus")
    private String equipmentStatus;
    @Column(name = "licenseExpire")
    private Integer licenseExpire;
    @Column(name = "fuelRatePerHour")
    private Double fuelRatePerHour;
    @Size(max = 80)
    @Column(name = "dcsConfigString")
    private String dcsConfigString;
    @Column(name = "statusCodeState")
    private Integer statusCodeState;
    @Column(name = "lastValidSpeedKPH")
    private Double lastValidSpeedKPH;
    @Column(name = "lastEngineOnHours")
    private Double lastEngineOnHours;
    @Column(name = "lastEngineOnTime")
    private Integer lastEngineOnTime;
    @Column(name = "lastEngineOffTime")
    private Integer lastEngineOffTime;
    @Column(name = "lastIgnitionOnHours")
    private Double lastIgnitionOnHours;
    @Size(max = 200)
    @Column(name = "pendingMessage")
    private String pendingMessage;
    @Size(max = 100)
    @Column(name = "pendingMessageACK")
    private String pendingMessageACK;
    @Column(name = "lastEventsPerSecond")
    private Double lastEventsPerSecond;
    @Column(name = "lastEventsPerSecondMS")
    private BigInteger lastEventsPerSecondMS;

    public Device() {
    }

    public Device(DevicePK devicePK) {
        this.devicePK = devicePK;
    }

    public Device(String accountID, String deviceID) {
        this.devicePK = new DevicePK(accountID, deviceID);
    }

    public DevicePK getDevicePK() {
        return devicePK;
    }

    public void setDevicePK(DevicePK devicePK) {
        this.devicePK = devicePK;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public Double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(Double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public Integer getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Integer expirationTime) {
        this.expirationTime = expirationTime;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getPushpinID() {
        return pushpinID;
    }

    public void setPushpinID(String pushpinID) {
        this.pushpinID = pushpinID;
    }

    public String getDisplayColor() {
        return displayColor;
    }

    public void setDisplayColor(String displayColor) {
        this.displayColor = displayColor;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSimPhoneNumber() {
        return simPhoneNumber;
    }

    public void setSimPhoneNumber(String simPhoneNumber) {
        this.simPhoneNumber = simPhoneNumber;
    }

    public String getSmsEmail() {
        return smsEmail;
    }

    public void setSmsEmail(String smsEmail) {
        this.smsEmail = smsEmail;
    }

    public String getImeiNumber() {
        return imeiNumber;
    }

    public void setImeiNumber(String imeiNumber) {
        this.imeiNumber = imeiNumber;
    }

    public String getDataKey() {
        return dataKey;
    }

    public void setDataKey(String dataKey) {
        this.dataKey = dataKey;
    }

    public Short getIgnitionIndex() {
        return ignitionIndex;
    }

    public void setIgnitionIndex(Short ignitionIndex) {
        this.ignitionIndex = ignitionIndex;
    }

    public String getCodeVersion() {
        return codeVersion;
    }

    public void setCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
    }

    public String getFeatureSet() {
        return featureSet;
    }

    public void setFeatureSet(String featureSet) {
        this.featureSet = featureSet;
    }

    public String getIpAddressValid() {
        return ipAddressValid;
    }

    public void setIpAddressValid(String ipAddressValid) {
        this.ipAddressValid = ipAddressValid;
    }

    public Integer getLastTotalConnectTime() {
        return lastTotalConnectTime;
    }

    public void setLastTotalConnectTime(Integer lastTotalConnectTime) {
        this.lastTotalConnectTime = lastTotalConnectTime;
    }

    public Integer getLastDuplexConnectTime() {
        return lastDuplexConnectTime;
    }

    public void setLastDuplexConnectTime(Integer lastDuplexConnectTime) {
        this.lastDuplexConnectTime = lastDuplexConnectTime;
    }

    public String getPendingPingCommand() {
        return pendingPingCommand;
    }

    public void setPendingPingCommand(String pendingPingCommand) {
        this.pendingPingCommand = pendingPingCommand;
    }

    public Integer getLastPingTime() {
        return lastPingTime;
    }

    public void setLastPingTime(Integer lastPingTime) {
        this.lastPingTime = lastPingTime;
    }

    public Short getTotalPingCount() {
        return totalPingCount;
    }

    public void setTotalPingCount(Short totalPingCount) {
        this.totalPingCount = totalPingCount;
    }

    public Short getMaxPingCount() {
        return maxPingCount;
    }

    public void setMaxPingCount(Short maxPingCount) {
        this.maxPingCount = maxPingCount;
    }

    public Short getExpectAck() {
        return expectAck;
    }

    public void setExpectAck(Short expectAck) {
        this.expectAck = expectAck;
    }

    public String getLastAckCommand() {
        return lastAckCommand;
    }

    public void setLastAckCommand(String lastAckCommand) {
        this.lastAckCommand = lastAckCommand;
    }

    public Integer getLastAckTime() {
        return lastAckTime;
    }

    public void setLastAckTime(Integer lastAckTime) {
        this.lastAckTime = lastAckTime;
    }

    public Integer getDcsConfigMask() {
        return dcsConfigMask;
    }

    public void setDcsConfigMask(Integer dcsConfigMask) {
        this.dcsConfigMask = dcsConfigMask;
    }

    public Short getSupportsDMTP() {
        return supportsDMTP;
    }

    public void setSupportsDMTP(Short supportsDMTP) {
        this.supportsDMTP = supportsDMTP;
    }

    public Short getSupportedEncodings() {
        return supportedEncodings;
    }

    public void setSupportedEncodings(Short supportedEncodings) {
        this.supportedEncodings = supportedEncodings;
    }

    public Short getUnitLimitInterval() {
        return unitLimitInterval;
    }

    public void setUnitLimitInterval(Short unitLimitInterval) {
        this.unitLimitInterval = unitLimitInterval;
    }

    public Short getMaxAllowedEvents() {
        return maxAllowedEvents;
    }

    public void setMaxAllowedEvents(Short maxAllowedEvents) {
        this.maxAllowedEvents = maxAllowedEvents;
    }

    public byte[] getTotalProfileMask() {
        return totalProfileMask;
    }

    public void setTotalProfileMask(byte[] totalProfileMask) {
        this.totalProfileMask = totalProfileMask;
    }

    public Short getTotalMaxConn() {
        return totalMaxConn;
    }

    public void setTotalMaxConn(Short totalMaxConn) {
        this.totalMaxConn = totalMaxConn;
    }

    public Short getTotalMaxConnPerMin() {
        return totalMaxConnPerMin;
    }

    public void setTotalMaxConnPerMin(Short totalMaxConnPerMin) {
        this.totalMaxConnPerMin = totalMaxConnPerMin;
    }

    public byte[] getDuplexProfileMask() {
        return duplexProfileMask;
    }

    public void setDuplexProfileMask(byte[] duplexProfileMask) {
        this.duplexProfileMask = duplexProfileMask;
    }

    public Short getDuplexMaxConn() {
        return duplexMaxConn;
    }

    public void setDuplexMaxConn(Short duplexMaxConn) {
        this.duplexMaxConn = duplexMaxConn;
    }

    public Short getDuplexMaxConnPerMin() {
        return duplexMaxConnPerMin;
    }

    public void setDuplexMaxConnPerMin(Short duplexMaxConnPerMin) {
        this.duplexMaxConnPerMin = duplexMaxConnPerMin;
    }

    public String getIpAddressCurrent() {
        return ipAddressCurrent;
    }

    public void setIpAddressCurrent(String ipAddressCurrent) {
        this.ipAddressCurrent = ipAddressCurrent;
    }

    public Short getRemotePortCurrent() {
        return remotePortCurrent;
    }

    public void setRemotePortCurrent(Short remotePortCurrent) {
        this.remotePortCurrent = remotePortCurrent;
    }

    public Short getListenPortCurrent() {
        return listenPortCurrent;
    }

    public void setListenPortCurrent(Short listenPortCurrent) {
        this.listenPortCurrent = listenPortCurrent;
    }

    public Integer getLastInputState() {
        return lastInputState;
    }

    public void setLastInputState(Integer lastInputState) {
        this.lastInputState = lastInputState;
    }

    public Double getLastBatteryLevel() {
        return lastBatteryLevel;
    }

    public void setLastBatteryLevel(Double lastBatteryLevel) {
        this.lastBatteryLevel = lastBatteryLevel;
    }

    public Double getLastValidLatitude() {
        return lastValidLatitude;
    }

    public void setLastValidLatitude(Double lastValidLatitude) {
        this.lastValidLatitude = lastValidLatitude;
    }

    public Double getLastValidLongitude() {
        return lastValidLongitude;
    }

    public void setLastValidLongitude(Double lastValidLongitude) {
        this.lastValidLongitude = lastValidLongitude;
    }

    public Integer getLastGPSTimestamp() {
        return lastGPSTimestamp;
    }

    public void setLastGPSTimestamp(Integer lastGPSTimestamp) {
        this.lastGPSTimestamp = lastGPSTimestamp;
    }

    public Double getLastOdometerKM() {
        return lastOdometerKM;
    }

    public void setLastOdometerKM(Double lastOdometerKM) {
        this.lastOdometerKM = lastOdometerKM;
    }

    public Double getOdometerOffsetKM() {
        return odometerOffsetKM;
    }

    public void setOdometerOffsetKM(Double odometerOffsetKM) {
        this.odometerOffsetKM = odometerOffsetKM;
    }

    public Short getIsActive() {
        return isActive;
    }

    public void setIsActive(Short isActive) {
        this.isActive = isActive;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Integer lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Integer getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Integer creationTime) {
        this.creationTime = creationTime;
    }

    public Double getLastFuelLevel() {
        return lastFuelLevel;
    }

    public void setLastFuelLevel(Double lastFuelLevel) {
        this.lastFuelLevel = lastFuelLevel;
    }

    public Double getSpeedLimitKPH() {
        return speedLimitKPH;
    }

    public void setSpeedLimitKPH(Double speedLimitKPH) {
        this.speedLimitKPH = speedLimitKPH;
    }

    public Double getLastOilLevel() {
        return lastOilLevel;
    }

    public void setLastOilLevel(Double lastOilLevel) {
        this.lastOilLevel = lastOilLevel;
    }

    public Short getAllowNotify() {
        return allowNotify;
    }

    public void setAllowNotify(Short allowNotify) {
        this.allowNotify = allowNotify;
    }

    public Integer getLastNotifyTime() {
        return lastNotifyTime;
    }

    public void setLastNotifyTime(Integer lastNotifyTime) {
        this.lastNotifyTime = lastNotifyTime;
    }

    public Integer getLastNotifyCode() {
        return lastNotifyCode;
    }

    public void setLastNotifyCode(Integer lastNotifyCode) {
        this.lastNotifyCode = lastNotifyCode;
    }

    public String getNotifyEmail() {
        return notifyEmail;
    }

    public void setNotifyEmail(String notifyEmail) {
        this.notifyEmail = notifyEmail;
    }

    public String getNotifySelector() {
        return notifySelector;
    }

    public void setNotifySelector(String notifySelector) {
        this.notifySelector = notifySelector;
    }

    public Integer getNotifyAction() {
        return notifyAction;
    }

    public void setNotifyAction(Integer notifyAction) {
        this.notifyAction = notifyAction;
    }

    public String getNotifyDescription() {
        return notifyDescription;
    }

    public void setNotifyDescription(String notifyDescription) {
        this.notifyDescription = notifyDescription;
    }

    public String getNotifySubject() {
        return notifySubject;
    }

    public void setNotifySubject(String notifySubject) {
        this.notifySubject = notifySubject;
    }

    public String getNotifyText() {
        return notifyText;
    }

    public void setNotifyText(String notifyText) {
        this.notifyText = notifyText;
    }

    public Short getNotifyUseWrapper() {
        return notifyUseWrapper;
    }

    public void setNotifyUseWrapper(Short notifyUseWrapper) {
        this.notifyUseWrapper = notifyUseWrapper;
    }

    public Short getNotifyPriority() {
        return notifyPriority;
    }

    public void setNotifyPriority(Short notifyPriority) {
        this.notifyPriority = notifyPriority;
    }

    public Double getMaintIntervalKM0() {
        return maintIntervalKM0;
    }

    public void setMaintIntervalKM0(Double maintIntervalKM0) {
        this.maintIntervalKM0 = maintIntervalKM0;
    }

    public Double getMaintOdometerKM0() {
        return maintOdometerKM0;
    }

    public void setMaintOdometerKM0(Double maintOdometerKM0) {
        this.maintOdometerKM0 = maintOdometerKM0;
    }

    public Double getMaintIntervalKM1() {
        return maintIntervalKM1;
    }

    public void setMaintIntervalKM1(Double maintIntervalKM1) {
        this.maintIntervalKM1 = maintIntervalKM1;
    }

    public Double getMaintOdometerKM1() {
        return maintOdometerKM1;
    }

    public void setMaintOdometerKM1(Double maintOdometerKM1) {
        this.maintOdometerKM1 = maintOdometerKM1;
    }

    public String getMaintNotes() {
        return maintNotes;
    }

    public void setMaintNotes(String maintNotes) {
        this.maintNotes = maintNotes;
    }

    public Double getFuelEconomy() {
        return fuelEconomy;
    }

    public void setFuelEconomy(Double fuelEconomy) {
        this.fuelEconomy = fuelEconomy;
    }

    public Double getLastValidHeading() {
        return lastValidHeading;
    }

    public void setLastValidHeading(Double lastValidHeading) {
        this.lastValidHeading = lastValidHeading;
    }

    public String getLastCellServingInfo() {
        return lastCellServingInfo;
    }

    public void setLastCellServingInfo(String lastCellServingInfo) {
        this.lastCellServingInfo = lastCellServingInfo;
    }

    public Double getLastEngineHours() {
        return lastEngineHours;
    }

    public void setLastEngineHours(Double lastEngineHours) {
        this.lastEngineHours = lastEngineHours;
    }

    public Double getMaintIntervalHR0() {
        return maintIntervalHR0;
    }

    public void setMaintIntervalHR0(Double maintIntervalHR0) {
        this.maintIntervalHR0 = maintIntervalHR0;
    }

    public Double getMaintEngHoursHR0() {
        return maintEngHoursHR0;
    }

    public void setMaintEngHoursHR0(Double maintEngHoursHR0) {
        this.maintEngHoursHR0 = maintEngHoursHR0;
    }

    public String getDcsPropertiesID() {
        return dcsPropertiesID;
    }

    public void setDcsPropertiesID(String dcsPropertiesID) {
        this.dcsPropertiesID = dcsPropertiesID;
    }

    public Double getLastFuelTotal() {
        return lastFuelTotal;
    }

    public void setLastFuelTotal(Double lastFuelTotal) {
        this.lastFuelTotal = lastFuelTotal;
    }

    public Double getParkedLatitude() {
        return parkedLatitude;
    }

    public void setParkedLatitude(Double parkedLatitude) {
        this.parkedLatitude = parkedLatitude;
    }

    public Double getParkedLongitude() {
        return parkedLongitude;
    }

    public void setParkedLongitude(Double parkedLongitude) {
        this.parkedLongitude = parkedLongitude;
    }

    public Double getParkedRadius() {
        return parkedRadius;
    }

    public void setParkedRadius(Double parkedRadius) {
        this.parkedRadius = parkedRadius;
    }

    public Double getPlanDistanceKM() {
        return planDistanceKM;
    }

    public void setPlanDistanceKM(Double planDistanceKM) {
        this.planDistanceKM = planDistanceKM;
    }

    public Integer getLastIgnitionOnTime() {
        return lastIgnitionOnTime;
    }

    public void setLastIgnitionOnTime(Integer lastIgnitionOnTime) {
        this.lastIgnitionOnTime = lastIgnitionOnTime;
    }

    public String getActiveCorridor() {
        return activeCorridor;
    }

    public void setActiveCorridor(String activeCorridor) {
        this.activeCorridor = activeCorridor;
    }

    public Integer getLastIgnitionOffTime() {
        return lastIgnitionOffTime;
    }

    public void setLastIgnitionOffTime(Integer lastIgnitionOffTime) {
        this.lastIgnitionOffTime = lastIgnitionOffTime;
    }

    public Integer getLastDataPushTime() {
        return lastDataPushTime;
    }

    public void setLastDataPushTime(Integer lastDataPushTime) {
        this.lastDataPushTime = lastDataPushTime;
    }

    public BigInteger getLastEventCreateMillis() {
        return lastEventCreateMillis;
    }

    public void setLastEventCreateMillis(BigInteger lastEventCreateMillis) {
        this.lastEventCreateMillis = lastEventCreateMillis;
    }

    public Double getEngineHoursOffset() {
        return engineHoursOffset;
    }

    public void setEngineHoursOffset(Double engineHoursOffset) {
        this.engineHoursOffset = engineHoursOffset;
    }

    public String getSimID() {
        return simID;
    }

    public void setSimID(String simID) {
        this.simID = simID;
    }

    public Integer getLastEventTimestamp() {
        return lastEventTimestamp;
    }

    public void setLastEventTimestamp(Integer lastEventTimestamp) {
        this.lastEventTimestamp = lastEventTimestamp;
    }

    public Integer getLastStopTime() {
        return lastStopTime;
    }

    public void setLastStopTime(Integer lastStopTime) {
        this.lastStopTime = lastStopTime;
    }

    public Integer getLastStartTime() {
        return lastStartTime;
    }

    public void setLastStartTime(Integer lastStartTime) {
        this.lastStartTime = lastStartTime;
    }

    public String getLastTcpSessionID() {
        return lastTcpSessionID;
    }

    public void setLastTcpSessionID(String lastTcpSessionID) {
        this.lastTcpSessionID = lastTcpSessionID;
    }

    public Double getLastIgnitionHours() {
        return lastIgnitionHours;
    }

    public void setLastIgnitionHours(Double lastIgnitionHours) {
        this.lastIgnitionHours = lastIgnitionHours;
    }

    public Short getLastMalfunctionLamp() {
        return lastMalfunctionLamp;
    }

    public void setLastMalfunctionLamp(Short lastMalfunctionLamp) {
        this.lastMalfunctionLamp = lastMalfunctionLamp;
    }

    public String getLastFaultCode() {
        return lastFaultCode;
    }

    public void setLastFaultCode(String lastFaultCode) {
        this.lastFaultCode = lastFaultCode;
    }

    public String getWorkOrderID() {
        return workOrderID;
    }

    public void setWorkOrderID(String workOrderID) {
        this.workOrderID = workOrderID;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public Double getJobLatitude() {
        return jobLatitude;
    }

    public void setJobLatitude(Double jobLatitude) {
        this.jobLatitude = jobLatitude;
    }

    public Double getJobLongitude() {
        return jobLongitude;
    }

    public void setJobLongitude(Double jobLongitude) {
        this.jobLongitude = jobLongitude;
    }

    public Double getJobRadius() {
        return jobRadius;
    }

    public void setJobRadius(Double jobRadius) {
        this.jobRadius = jobRadius;
    }

    public String getCustomAttributes() {
        return customAttributes;
    }

    public void setCustomAttributes(String customAttributes) {
        this.customAttributes = customAttributes;
    }

    public String getReminderMessage() {
        return reminderMessage;
    }

    public void setReminderMessage(String reminderMessage) {
        this.reminderMessage = reminderMessage;
    }

    public String getReminderInterval() {
        return reminderInterval;
    }

    public void setReminderInterval(String reminderInterval) {
        this.reminderInterval = reminderInterval;
    }

    public Integer getReminderTime() {
        return reminderTime;
    }

    public void setReminderTime(Integer reminderTime) {
        this.reminderTime = reminderTime;
    }

    public String getLinkURL() {
        return linkURL;
    }

    public void setLinkURL(String linkURL) {
        this.linkURL = linkURL;
    }

    public String getLinkDescription() {
        return linkDescription;
    }

    public void setLinkDescription(String linkDescription) {
        this.linkDescription = linkDescription;
    }

    public String getLastNotifyRule() {
        return lastNotifyRule;
    }

    public void setLastNotifyRule(String lastNotifyRule) {
        this.lastNotifyRule = lastNotifyRule;
    }

    public String getAssignedUserID() {
        return assignedUserID;
    }

    public void setAssignedUserID(String assignedUserID) {
        this.assignedUserID = assignedUserID;
    }

    public String getThermalProfile() {
        return thermalProfile;
    }

    public void setThermalProfile(String thermalProfile) {
        this.thermalProfile = thermalProfile;
    }

    public Integer getLastServiceTime() {
        return lastServiceTime;
    }

    public void setLastServiceTime(Integer lastServiceTime) {
        this.lastServiceTime = lastServiceTime;
    }

    public Integer getNextServiceTime() {
        return nextServiceTime;
    }

    public void setNextServiceTime(Integer nextServiceTime) {
        this.nextServiceTime = nextServiceTime;
    }

    public Integer getExpectAckCode() {
        return expectAckCode;
    }

    public void setExpectAckCode(Integer expectAckCode) {
        this.expectAckCode = expectAckCode;
    }

    public String getDcsCommandHost() {
        return dcsCommandHost;
    }

    public void setDcsCommandHost(String dcsCommandHost) {
        this.dcsCommandHost = dcsCommandHost;
    }

    public Double getMaxVfuelprobe() {
        return maxVfuelprobe;
    }

    public void setMaxVfuelprobe(Double maxVfuelprobe) {
        this.maxVfuelprobe = maxVfuelprobe;
    }

    public Double getMinVfuelprobe() {
        return minVfuelprobe;
    }

    public void setMinVfuelprobe(Double minVfuelprobe) {
        this.minVfuelprobe = minVfuelprobe;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public Integer getDriverStatus() {
        return driverStatus;
    }

    public void setDriverStatus(Integer driverStatus) {
        this.driverStatus = driverStatus;
    }

    public Integer getInstallTime() {
        return installTime;
    }

    public void setInstallTime(Integer installTime) {
        this.installTime = installTime;
    }

    public Integer getResetTime() {
        return resetTime;
    }

    public void setResetTime(Integer resetTime) {
        this.resetTime = resetTime;
    }

    public Integer getCommandStateMask() {
        return commandStateMask;
    }

    public void setCommandStateMask(Integer commandStateMask) {
        this.commandStateMask = commandStateMask;
    }

    public Integer getLastOutputState() {
        return lastOutputState;
    }

    public void setLastOutputState(Integer lastOutputState) {
        this.lastOutputState = lastOutputState;
    }

    public Double getLastDistanceKM() {
        return lastDistanceKM;
    }

    public void setLastDistanceKM(Double lastDistanceKM) {
        this.lastDistanceKM = lastDistanceKM;
    }

    public String getHoursOfOperation() {
        return hoursOfOperation;
    }

    public void setHoursOfOperation(String hoursOfOperation) {
        this.hoursOfOperation = hoursOfOperation;
    }

    public String getEquipmentStatus() {
        return equipmentStatus;
    }

    public void setEquipmentStatus(String equipmentStatus) {
        this.equipmentStatus = equipmentStatus;
    }

    public Integer getLicenseExpire() {
        return licenseExpire;
    }

    public void setLicenseExpire(Integer licenseExpire) {
        this.licenseExpire = licenseExpire;
    }

    public Double getFuelRatePerHour() {
        return fuelRatePerHour;
    }

    public void setFuelRatePerHour(Double fuelRatePerHour) {
        this.fuelRatePerHour = fuelRatePerHour;
    }

    public String getDcsConfigString() {
        return dcsConfigString;
    }

    public void setDcsConfigString(String dcsConfigString) {
        this.dcsConfigString = dcsConfigString;
    }

    public Integer getStatusCodeState() {
        return statusCodeState;
    }

    public void setStatusCodeState(Integer statusCodeState) {
        this.statusCodeState = statusCodeState;
    }

    public Double getLastValidSpeedKPH() {
        return lastValidSpeedKPH;
    }

    public void setLastValidSpeedKPH(Double lastValidSpeedKPH) {
        this.lastValidSpeedKPH = lastValidSpeedKPH;
    }

    public Double getLastEngineOnHours() {
        return lastEngineOnHours;
    }

    public void setLastEngineOnHours(Double lastEngineOnHours) {
        this.lastEngineOnHours = lastEngineOnHours;
    }

    public Integer getLastEngineOnTime() {
        return lastEngineOnTime;
    }

    public void setLastEngineOnTime(Integer lastEngineOnTime) {
        this.lastEngineOnTime = lastEngineOnTime;
    }

    public Integer getLastEngineOffTime() {
        return lastEngineOffTime;
    }

    public void setLastEngineOffTime(Integer lastEngineOffTime) {
        this.lastEngineOffTime = lastEngineOffTime;
    }

    public Double getLastIgnitionOnHours() {
        return lastIgnitionOnHours;
    }

    public void setLastIgnitionOnHours(Double lastIgnitionOnHours) {
        this.lastIgnitionOnHours = lastIgnitionOnHours;
    }

    public String getPendingMessage() {
        return pendingMessage;
    }

    public void setPendingMessage(String pendingMessage) {
        this.pendingMessage = pendingMessage;
    }

    public String getPendingMessageACK() {
        return pendingMessageACK;
    }

    public void setPendingMessageACK(String pendingMessageACK) {
        this.pendingMessageACK = pendingMessageACK;
    }

    public Double getLastEventsPerSecond() {
        return lastEventsPerSecond;
    }

    public void setLastEventsPerSecond(Double lastEventsPerSecond) {
        this.lastEventsPerSecond = lastEventsPerSecond;
    }

    public BigInteger getLastEventsPerSecondMS() {
        return lastEventsPerSecondMS;
    }

    public void setLastEventsPerSecondMS(BigInteger lastEventsPerSecondMS) {
        this.lastEventsPerSecondMS = lastEventsPerSecondMS;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (devicePK != null ? devicePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Device)) {
            return false;
        }
        Device other = (Device) object;
        if ((this.devicePK == null && other.devicePK != null) || (this.devicePK != null && !this.devicePK.equals(other.devicePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.gpstouch.gts.backend.model.Device[ devicePK=" + devicePK + " ]";
    }

}
