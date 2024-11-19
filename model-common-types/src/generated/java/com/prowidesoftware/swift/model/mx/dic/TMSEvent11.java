
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Result of an individual terminal management action performed by the point of interaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMSEvent11", propOrder = {
    "tmStmp",
    "rslt",
    "actnId",
    "addtlErrInf",
    "termnlMgrId",
    "dvcRspn"
})
public class TMSEvent11 {

    @XmlElement(name = "TmStmp", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime tmStmp;
    @XmlElement(name = "Rslt", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementActionResult5Code rslt;
    @XmlElement(name = "ActnId", required = true)
    protected TMSActionIdentification9 actnId;
    @XmlElement(name = "AddtlErrInf")
    protected String addtlErrInf;
    @XmlElement(name = "TermnlMgrId")
    protected String termnlMgrId;
    @XmlElement(name = "DvcRspn")
    protected DeviceResponse7 dvcRspn;

    /**
     * Gets the value of the tmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getTmStmp() {
        return tmStmp;
    }

    /**
     * Sets the value of the tmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TMSEvent11 setTmStmp(OffsetDateTime value) {
        this.tmStmp = value;
        return this;
    }

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementActionResult5Code }
     *     
     */
    public TerminalManagementActionResult5Code getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementActionResult5Code }
     *     
     */
    public TMSEvent11 setRslt(TerminalManagementActionResult5Code value) {
        this.rslt = value;
        return this;
    }

    /**
     * Gets the value of the actnId property.
     * 
     * @return
     *     possible object is
     *     {@link TMSActionIdentification9 }
     *     
     */
    public TMSActionIdentification9 getActnId() {
        return actnId;
    }

    /**
     * Sets the value of the actnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSActionIdentification9 }
     *     
     */
    public TMSEvent11 setActnId(TMSActionIdentification9 value) {
        this.actnId = value;
        return this;
    }

    /**
     * Gets the value of the addtlErrInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlErrInf() {
        return addtlErrInf;
    }

    /**
     * Sets the value of the addtlErrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TMSEvent11 setAddtlErrInf(String value) {
        this.addtlErrInf = value;
        return this;
    }

    /**
     * Gets the value of the termnlMgrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermnlMgrId() {
        return termnlMgrId;
    }

    /**
     * Sets the value of the termnlMgrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TMSEvent11 setTermnlMgrId(String value) {
        this.termnlMgrId = value;
        return this;
    }

    /**
     * Gets the value of the dvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceResponse7 }
     *     
     */
    public DeviceResponse7 getDvcRspn() {
        return dvcRspn;
    }

    /**
     * Sets the value of the dvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceResponse7 }
     *     
     */
    public TMSEvent11 setDvcRspn(DeviceResponse7 value) {
        this.dvcRspn = value;
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
