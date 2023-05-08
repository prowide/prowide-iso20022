
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Contains ticket details. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ticket2", propOrder = {
    "tcktNb",
    "tcktIssr",
    "tcktIsseDt",
    "tcktIsseLctn",
    "cnjnctnTcktNb",
    "rstrctdTcktInd",
    "opnTcktInd",
    "rstrctns",
    "xchgdTcktInd",
    "xchgdTcktNb",
    "rcrdLctrNb",
    "rsvatn"
})
public class Ticket2 {

    @XmlElement(name = "TcktNb")
    protected String tcktNb;
    @XmlElement(name = "TcktIssr")
    protected PartyIdentification258 tcktIssr;
    @XmlElement(name = "TcktIsseDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar tcktIsseDt;
    @XmlElement(name = "TcktIsseLctn")
    protected String tcktIsseLctn;
    @XmlElement(name = "CnjnctnTcktNb")
    protected String cnjnctnTcktNb;
    @XmlElement(name = "RstrctdTcktInd")
    protected Boolean rstrctdTcktInd;
    @XmlElement(name = "OpnTcktInd")
    protected Boolean opnTcktInd;
    @XmlElement(name = "Rstrctns")
    protected String rstrctns;
    @XmlElement(name = "XchgdTcktInd")
    protected Boolean xchgdTcktInd;
    @XmlElement(name = "XchgdTcktNb")
    protected String xchgdTcktNb;
    @XmlElement(name = "RcrdLctrNb")
    protected String rcrdLctrNb;
    @XmlElement(name = "Rsvatn")
    protected ReservationDetails3 rsvatn;

    /**
     * Gets the value of the tcktNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcktNb() {
        return tcktNb;
    }

    /**
     * Sets the value of the tcktNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Ticket2 setTcktNb(String value) {
        this.tcktNb = value;
        return this;
    }

    /**
     * Gets the value of the tcktIssr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification258 }
     *     
     */
    public PartyIdentification258 getTcktIssr() {
        return tcktIssr;
    }

    /**
     * Sets the value of the tcktIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification258 }
     *     
     */
    public Ticket2 setTcktIssr(PartyIdentification258 value) {
        this.tcktIssr = value;
        return this;
    }

    /**
     * Gets the value of the tcktIsseDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getTcktIsseDt() {
        return tcktIsseDt;
    }

    /**
     * Sets the value of the tcktIsseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Ticket2 setTcktIsseDt(Calendar value) {
        this.tcktIsseDt = value;
        return this;
    }

    /**
     * Gets the value of the tcktIsseLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcktIsseLctn() {
        return tcktIsseLctn;
    }

    /**
     * Sets the value of the tcktIsseLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Ticket2 setTcktIsseLctn(String value) {
        this.tcktIsseLctn = value;
        return this;
    }

    /**
     * Gets the value of the cnjnctnTcktNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnjnctnTcktNb() {
        return cnjnctnTcktNb;
    }

    /**
     * Sets the value of the cnjnctnTcktNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Ticket2 setCnjnctnTcktNb(String value) {
        this.cnjnctnTcktNb = value;
        return this;
    }

    /**
     * Gets the value of the rstrctdTcktInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRstrctdTcktInd() {
        return rstrctdTcktInd;
    }

    /**
     * Sets the value of the rstrctdTcktInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Ticket2 setRstrctdTcktInd(Boolean value) {
        this.rstrctdTcktInd = value;
        return this;
    }

    /**
     * Gets the value of the opnTcktInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpnTcktInd() {
        return opnTcktInd;
    }

    /**
     * Sets the value of the opnTcktInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Ticket2 setOpnTcktInd(Boolean value) {
        this.opnTcktInd = value;
        return this;
    }

    /**
     * Gets the value of the rstrctns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstrctns() {
        return rstrctns;
    }

    /**
     * Sets the value of the rstrctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Ticket2 setRstrctns(String value) {
        this.rstrctns = value;
        return this;
    }

    /**
     * Gets the value of the xchgdTcktInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXchgdTcktInd() {
        return xchgdTcktInd;
    }

    /**
     * Sets the value of the xchgdTcktInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Ticket2 setXchgdTcktInd(Boolean value) {
        this.xchgdTcktInd = value;
        return this;
    }

    /**
     * Gets the value of the xchgdTcktNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXchgdTcktNb() {
        return xchgdTcktNb;
    }

    /**
     * Sets the value of the xchgdTcktNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Ticket2 setXchgdTcktNb(String value) {
        this.xchgdTcktNb = value;
        return this;
    }

    /**
     * Gets the value of the rcrdLctrNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcrdLctrNb() {
        return rcrdLctrNb;
    }

    /**
     * Sets the value of the rcrdLctrNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Ticket2 setRcrdLctrNb(String value) {
        this.rcrdLctrNb = value;
        return this;
    }

    /**
     * Gets the value of the rsvatn property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationDetails3 }
     *     
     */
    public ReservationDetails3 getRsvatn() {
        return rsvatn;
    }

    /**
     * Sets the value of the rsvatn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationDetails3 }
     *     
     */
    public Ticket2 setRsvatn(ReservationDetails3 value) {
        this.rsvatn = value;
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
