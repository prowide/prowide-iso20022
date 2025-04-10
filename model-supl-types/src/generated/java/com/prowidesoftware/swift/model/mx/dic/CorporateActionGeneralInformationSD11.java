
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "CorporateActionGeneralInformationSD11", propOrder = {
    "plcAndNm",
    "evtGrp",
    "evtTp",
    "subEvtTp",
    "dtcMndtryVlntryEvtTp",
    "dclrdMndtryVlntryEvtTp",
    "edsMsggElgbltyFlg"
})
public class CorporateActionGeneralInformationSD11 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "EvtGrp")
    @XmlSchemaType(name = "string")
    protected EventGroup1Code evtGrp;
    @XmlElement(name = "EvtTp")
    @XmlSchemaType(name = "string")
    protected ExtendedEventType1Code evtTp;
    @XmlElement(name = "SubEvtTp")
    @XmlSchemaType(name = "string")
    protected DTCCSubEventType2Code subEvtTp;
    @XmlElement(name = "DTCMndtryVlntryEvtTp")
    @XmlSchemaType(name = "string")
    protected CorporateActionMandatoryVoluntary1Code dtcMndtryVlntryEvtTp;
    @XmlElement(name = "DclrdMndtryVlntryEvtTp")
    @XmlSchemaType(name = "string")
    protected CorporateActionMandatoryVoluntary1Code dclrdMndtryVlntryEvtTp;
    @XmlElement(name = "EDSMsggElgbltyFlg")
    protected Boolean edsMsggElgbltyFlg;

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
    public CorporateActionGeneralInformationSD11 setPlcAndNm(String value) {
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
    public CorporateActionGeneralInformationSD11 setEvtGrp(EventGroup1Code value) {
        this.evtGrp = value;
        return this;
    }

    /**
     * Gets the value of the evtTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedEventType1Code }
     *     
     */
    public ExtendedEventType1Code getEvtTp() {
        return evtTp;
    }

    /**
     * Sets the value of the evtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedEventType1Code }
     *     
     */
    public CorporateActionGeneralInformationSD11 setEvtTp(ExtendedEventType1Code value) {
        this.evtTp = value;
        return this;
    }

    /**
     * Gets the value of the subEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCSubEventType2Code }
     *     
     */
    public DTCCSubEventType2Code getSubEvtTp() {
        return subEvtTp;
    }

    /**
     * Sets the value of the subEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCSubEventType2Code }
     *     
     */
    public CorporateActionGeneralInformationSD11 setSubEvtTp(DTCCSubEventType2Code value) {
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
    public CorporateActionGeneralInformationSD11 setDTCMndtryVlntryEvtTp(CorporateActionMandatoryVoluntary1Code value) {
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
    public CorporateActionGeneralInformationSD11 setDclrdMndtryVlntryEvtTp(CorporateActionMandatoryVoluntary1Code value) {
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
    public CorporateActionGeneralInformationSD11 setEDSMsggElgbltyFlg(Boolean value) {
        this.edsMsggElgbltyFlg = value;
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
