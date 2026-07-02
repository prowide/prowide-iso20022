
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides selected corporate action events message details extracted from the related custodian messages received.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedCustodianMessageDetailsSD1", propOrder = {
    "rcvdEvtTp",
    "rcvdMndtryVlntryEvtTp",
    "rcvdCorpActnEvtId",
    "rcvdDt",
    "rcvdTm",
    "inbndISOMT",
    "inbndISOMsgRcvrBIC",
    "rcvdRltdRef",
    "rcvdSndrMsgRef",
    "inbndISOMsgSndrBIC"
})
public class RelatedCustodianMessageDetailsSD1 {

    @XmlElement(name = "RcvdEvtTp", required = true)
    protected String rcvdEvtTp;
    @XmlElement(name = "RcvdMndtryVlntryEvtTp", required = true)
    protected String rcvdMndtryVlntryEvtTp;
    @XmlElement(name = "RcvdCorpActnEvtId", required = true)
    protected String rcvdCorpActnEvtId;
    @XmlElement(name = "RcvdDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rcvdDt;
    @XmlElement(name = "RcvdTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar rcvdTm;
    @XmlElement(name = "InbndISOMT", required = true)
    protected String inbndISOMT;
    @XmlElement(name = "InbndISOMsgRcvrBIC", required = true)
    protected String inbndISOMsgRcvrBIC;
    @XmlElement(name = "RcvdRltdRef", required = true)
    protected String rcvdRltdRef;
    @XmlElement(name = "RcvdSndrMsgRef", required = true)
    protected String rcvdSndrMsgRef;
    @XmlElement(name = "InbndISOMsgSndrBIC", required = true)
    protected String inbndISOMsgSndrBIC;

    /**
     * Gets the value of the rcvdEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvdEvtTp() {
        return rcvdEvtTp;
    }

    /**
     * Sets the value of the rcvdEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RelatedCustodianMessageDetailsSD1 setRcvdEvtTp(String value) {
        this.rcvdEvtTp = value;
        return this;
    }

    /**
     * Gets the value of the rcvdMndtryVlntryEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvdMndtryVlntryEvtTp() {
        return rcvdMndtryVlntryEvtTp;
    }

    /**
     * Sets the value of the rcvdMndtryVlntryEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RelatedCustodianMessageDetailsSD1 setRcvdMndtryVlntryEvtTp(String value) {
        this.rcvdMndtryVlntryEvtTp = value;
        return this;
    }

    /**
     * Gets the value of the rcvdCorpActnEvtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvdCorpActnEvtId() {
        return rcvdCorpActnEvtId;
    }

    /**
     * Sets the value of the rcvdCorpActnEvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RelatedCustodianMessageDetailsSD1 setRcvdCorpActnEvtId(String value) {
        this.rcvdCorpActnEvtId = value;
        return this;
    }

    /**
     * Gets the value of the rcvdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRcvdDt() {
        return rcvdDt;
    }

    /**
     * Sets the value of the rcvdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RelatedCustodianMessageDetailsSD1 setRcvdDt(XMLGregorianCalendar value) {
        this.rcvdDt = value;
        return this;
    }

    /**
     * Gets the value of the rcvdTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRcvdTm() {
        return rcvdTm;
    }

    /**
     * Sets the value of the rcvdTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RelatedCustodianMessageDetailsSD1 setRcvdTm(XMLGregorianCalendar value) {
        this.rcvdTm = value;
        return this;
    }

    /**
     * Gets the value of the inbndISOMT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInbndISOMT() {
        return inbndISOMT;
    }

    /**
     * Sets the value of the inbndISOMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RelatedCustodianMessageDetailsSD1 setInbndISOMT(String value) {
        this.inbndISOMT = value;
        return this;
    }

    /**
     * Gets the value of the inbndISOMsgRcvrBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInbndISOMsgRcvrBIC() {
        return inbndISOMsgRcvrBIC;
    }

    /**
     * Sets the value of the inbndISOMsgRcvrBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RelatedCustodianMessageDetailsSD1 setInbndISOMsgRcvrBIC(String value) {
        this.inbndISOMsgRcvrBIC = value;
        return this;
    }

    /**
     * Gets the value of the rcvdRltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvdRltdRef() {
        return rcvdRltdRef;
    }

    /**
     * Sets the value of the rcvdRltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RelatedCustodianMessageDetailsSD1 setRcvdRltdRef(String value) {
        this.rcvdRltdRef = value;
        return this;
    }

    /**
     * Gets the value of the rcvdSndrMsgRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvdSndrMsgRef() {
        return rcvdSndrMsgRef;
    }

    /**
     * Sets the value of the rcvdSndrMsgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RelatedCustodianMessageDetailsSD1 setRcvdSndrMsgRef(String value) {
        this.rcvdSndrMsgRef = value;
        return this;
    }

    /**
     * Gets the value of the inbndISOMsgSndrBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInbndISOMsgSndrBIC() {
        return inbndISOMsgSndrBIC;
    }

    /**
     * Sets the value of the inbndISOMsgSndrBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RelatedCustodianMessageDetailsSD1 setInbndISOMsgSndrBIC(String value) {
        this.inbndISOMsgSndrBIC = value;
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
