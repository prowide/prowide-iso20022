
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides additional information regarding corporate action general information details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionGeneralInformationSD13", propOrder = {
    "plcAndNm",
    "evtGrp",
    "evtTp",
    "subEvtTp",
    "dtcMndtryVlntryEvtTp",
    "dclrdMndtryVlntryEvtTp",
    "edsMsggElgbltyFlg",
    "redId",
    "dtcfcpElctnFlg",
    "asstSvcrPrcgFlg"
})
public class CorporateActionGeneralInformationSD13 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "EvtGrp")
    @XmlSchemaType(name = "string")
    protected EventGroup1Code evtGrp;
    @XmlElement(name = "EvtTp")
    @XmlSchemaType(name = "string")
    protected ExtendedEventType2Code evtTp;
    @XmlElement(name = "SubEvtTp")
    @XmlSchemaType(name = "string")
    protected DTCCSubEventType3Code subEvtTp;
    @XmlElement(name = "DTCMndtryVlntryEvtTp")
    @XmlSchemaType(name = "string")
    protected CorporateActionMandatoryVoluntary1Code dtcMndtryVlntryEvtTp;
    @XmlElement(name = "DclrdMndtryVlntryEvtTp")
    @XmlSchemaType(name = "string")
    protected CorporateActionMandatoryVoluntary1Code dclrdMndtryVlntryEvtTp;
    @XmlElement(name = "EDSMsggElgbltyFlg")
    protected Boolean edsMsggElgbltyFlg;
    @XmlElement(name = "RedId")
    protected String redId;
    @XmlElement(name = "DTCFCPElctnFlg")
    protected Boolean dtcfcpElctnFlg;
    @XmlElement(name = "AsstSvcrPrcgFlg")
    protected Boolean asstSvcrPrcgFlg;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionGeneralInformationSD13 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the evtGrp property.
     * 
     * @return
     *     possible object is
     *     {@link EventGroup1Code }
     *     
     */
    public EventGroup1Code getEvtGrp() {
        return evtGrp;
    }

    /**
     * Sets the value of the evtGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventGroup1Code }
     *     
     */
    public CorporateActionGeneralInformationSD13 setEvtGrp(EventGroup1Code value) {
        this.evtGrp = value;
        return this;
    }

    /**
     * Gets the value of the evtTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedEventType2Code }
     *     
     */
    public ExtendedEventType2Code getEvtTp() {
        return evtTp;
    }

    /**
     * Sets the value of the evtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedEventType2Code }
     *     
     */
    public CorporateActionGeneralInformationSD13 setEvtTp(ExtendedEventType2Code value) {
        this.evtTp = value;
        return this;
    }

    /**
     * Gets the value of the subEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCSubEventType3Code }
     *     
     */
    public DTCCSubEventType3Code getSubEvtTp() {
        return subEvtTp;
    }

    /**
     * Sets the value of the subEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCSubEventType3Code }
     *     
     */
    public CorporateActionGeneralInformationSD13 setSubEvtTp(DTCCSubEventType3Code value) {
        this.subEvtTp = value;
        return this;
    }

    /**
     * Gets the value of the dtcMndtryVlntryEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMandatoryVoluntary1Code }
     *     
     */
    public CorporateActionMandatoryVoluntary1Code getDTCMndtryVlntryEvtTp() {
        return dtcMndtryVlntryEvtTp;
    }

    /**
     * Sets the value of the dtcMndtryVlntryEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMandatoryVoluntary1Code }
     *     
     */
    public CorporateActionGeneralInformationSD13 setDTCMndtryVlntryEvtTp(CorporateActionMandatoryVoluntary1Code value) {
        this.dtcMndtryVlntryEvtTp = value;
        return this;
    }

    /**
     * Gets the value of the dclrdMndtryVlntryEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMandatoryVoluntary1Code }
     *     
     */
    public CorporateActionMandatoryVoluntary1Code getDclrdMndtryVlntryEvtTp() {
        return dclrdMndtryVlntryEvtTp;
    }

    /**
     * Sets the value of the dclrdMndtryVlntryEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMandatoryVoluntary1Code }
     *     
     */
    public CorporateActionGeneralInformationSD13 setDclrdMndtryVlntryEvtTp(CorporateActionMandatoryVoluntary1Code value) {
        this.dclrdMndtryVlntryEvtTp = value;
        return this;
    }

    /**
     * Gets the value of the edsMsggElgbltyFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEDSMsggElgbltyFlg() {
        return edsMsggElgbltyFlg;
    }

    /**
     * Sets the value of the edsMsggElgbltyFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionGeneralInformationSD13 setEDSMsggElgbltyFlg(Boolean value) {
        this.edsMsggElgbltyFlg = value;
        return this;
    }

    /**
     * Gets the value of the redId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedId() {
        return redId;
    }

    /**
     * Sets the value of the redId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionGeneralInformationSD13 setRedId(String value) {
        this.redId = value;
        return this;
    }

    /**
     * Gets the value of the dtcfcpElctnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDTCFCPElctnFlg() {
        return dtcfcpElctnFlg;
    }

    /**
     * Sets the value of the dtcfcpElctnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionGeneralInformationSD13 setDTCFCPElctnFlg(Boolean value) {
        this.dtcfcpElctnFlg = value;
        return this;
    }

    /**
     * Gets the value of the asstSvcrPrcgFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAsstSvcrPrcgFlg() {
        return asstSvcrPrcgFlg;
    }

    /**
     * Sets the value of the asstSvcrPrcgFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionGeneralInformationSD13 setAsstSvcrPrcgFlg(Boolean value) {
        this.asstSvcrPrcgFlg = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
