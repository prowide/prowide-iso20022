
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
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
 * Maintenance command the ATM must perform.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCommand4", propOrder = {
    "tp",
    "urgcy",
    "dtTm",
    "cmdId",
    "rsn",
    "tracRsn",
    "addtlRsnInf",
    "cmdParams"
})
public class ATMCommand4 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMCommand2Code tp;
    @XmlElement(name = "Urgcy", required = true)
    @XmlSchemaType(name = "string")
    protected TMSContactLevel2Code urgcy;
    @XmlElement(name = "DtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar dtTm;
    @XmlElement(name = "CmdId")
    protected ATMCommandIdentification1 cmdId;
    @XmlElement(name = "Rsn")
    @XmlSchemaType(name = "string")
    protected ATMCommandReason1Code rsn;
    @XmlElement(name = "TracRsn")
    @XmlSchemaType(name = "string")
    protected List<ATMCommandReason1Code> tracRsn;
    @XmlElement(name = "AddtlRsnInf")
    protected String addtlRsnInf;
    @XmlElement(name = "CmdParams")
    protected ATMCommandParameters2Choice cmdParams;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommand2Code }
     *     
     */
    public ATMCommand2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommand2Code }
     *     
     */
    public ATMCommand4 setTp(ATMCommand2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the urgcy property.
     * 
     * @return
     *     possible object is
     *     {@link TMSContactLevel2Code }
     *     
     */
    public TMSContactLevel2Code getUrgcy() {
        return urgcy;
    }

    /**
     * Sets the value of the urgcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSContactLevel2Code }
     *     
     */
    public ATMCommand4 setUrgcy(TMSContactLevel2Code value) {
        this.urgcy = value;
        return this;
    }

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMCommand4 setDtTm(Calendar value) {
        this.dtTm = value;
        return this;
    }

    /**
     * Gets the value of the cmdId property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommandIdentification1 }
     *     
     */
    public ATMCommandIdentification1 getCmdId() {
        return cmdId;
    }

    /**
     * Sets the value of the cmdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommandIdentification1 }
     *     
     */
    public ATMCommand4 setCmdId(ATMCommandIdentification1 value) {
        this.cmdId = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommandReason1Code }
     *     
     */
    public ATMCommandReason1Code getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommandReason1Code }
     *     
     */
    public ATMCommand4 setRsn(ATMCommandReason1Code value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the tracRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tracRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTracRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCommandReason1Code }
     * 
     * 
     * @return
     *     The value of the tracRsn property.
     */
    public List<ATMCommandReason1Code> getTracRsn() {
        if (tracRsn == null) {
            tracRsn = new ArrayList<>();
        }
        return this.tracRsn;
    }

    /**
     * Gets the value of the addtlRsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRsnInf() {
        return addtlRsnInf;
    }

    /**
     * Sets the value of the addtlRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMCommand4 setAddtlRsnInf(String value) {
        this.addtlRsnInf = value;
        return this;
    }

    /**
     * Gets the value of the cmdParams property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommandParameters2Choice }
     *     
     */
    public ATMCommandParameters2Choice getCmdParams() {
        return cmdParams;
    }

    /**
     * Sets the value of the cmdParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommandParameters2Choice }
     *     
     */
    public ATMCommand4 setCmdParams(ATMCommandParameters2Choice value) {
        this.cmdParams = value;
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

    /**
     * Adds a new item to the tracRsn list.
     * @see #getTracRsn()
     * 
     */
    public ATMCommand4 addTracRsn(ATMCommandReason1Code tracRsn) {
        getTracRsn().add(tracRsn);
        return this;
    }

}
