
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
@XmlType(name = "TMSEvent7", propOrder = {
    "tmStmp",
    "rslt",
    "actnId",
    "addtlErrInf",
    "termnlMgrId"
})
public class TMSEvent7 {

    @XmlElement(name = "TmStmp", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tmStmp;
    @XmlElement(name = "Rslt", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementActionResult4Code rslt;
    @XmlElement(name = "ActnId", required = true)
    protected TMSActionIdentification6 actnId;
    @XmlElement(name = "AddtlErrInf")
    protected String addtlErrInf;
    @XmlElement(name = "TermnlMgrId")
    protected String termnlMgrId;

    /**
     * Gets the value of the tmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getTmStmp() {
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
    public TMSEvent7 setTmStmp(XMLGregorianCalendar value) {
        this.tmStmp = value;
        return this;
    }

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementActionResult4Code }
     *     
     */
    public TerminalManagementActionResult4Code getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementActionResult4Code }
     *     
     */
    public TMSEvent7 setRslt(TerminalManagementActionResult4Code value) {
        this.rslt = value;
        return this;
    }

    /**
     * Gets the value of the actnId property.
     * 
     * @return
     *     possible object is
     *     {@link TMSActionIdentification6 }
     *     
     */
    public TMSActionIdentification6 getActnId() {
        return actnId;
    }

    /**
     * Sets the value of the actnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSActionIdentification6 }
     *     
     */
    public TMSEvent7 setActnId(TMSActionIdentification6 value) {
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
    public TMSEvent7 setAddtlErrInf(String value) {
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
    public TMSEvent7 setTermnlMgrId(String value) {
        this.termnlMgrId = value;
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
