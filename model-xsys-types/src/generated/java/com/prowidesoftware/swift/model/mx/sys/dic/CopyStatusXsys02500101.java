
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * CopyStatus
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyStatus", propOrder = {
    "svc",
    "tmRg",
    "cntrPndgCp",
    "cntrCpdPndgAuth",
    "msgList",
    "refList"
})
public class CopyStatusXsys02500101 {

    @XmlElement(name = "Svc", required = true)
    protected String svc;
    @XmlElement(name = "TmRg", required = true)
    protected CopyStatusXsys02500101 .TmRg tmRg;
    @XmlElement(name = "CntrPndgCp")
    protected BigDecimal cntrPndgCp;
    @XmlElement(name = "CntrCpdPndgAuth")
    protected BigDecimal cntrCpdPndgAuth;
    @XmlElement(name = "MsgList")
    protected MessageListXsys02500101 msgList;
    @XmlElement(name = "RefList")
    protected ReferenceList refList;

    /**
     * Gets the value of the svc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvc() {
        return svc;
    }

    /**
     * Sets the value of the svc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CopyStatusXsys02500101 setSvc(String value) {
        this.svc = value;
        return this;
    }

    /**
     * Gets the value of the tmRg property.
     * 
     * @return
     *     possible object is
     *     {@link CopyStatusXsys02500101 .TmRg }
     *     
     */
    public CopyStatusXsys02500101 .TmRg getTmRg() {
        return tmRg;
    }

    /**
     * Sets the value of the tmRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyStatusXsys02500101 .TmRg }
     *     
     */
    public CopyStatusXsys02500101 setTmRg(CopyStatusXsys02500101 .TmRg value) {
        this.tmRg = value;
        return this;
    }

    /**
     * Gets the value of the cntrPndgCp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCntrPndgCp() {
        return cntrPndgCp;
    }

    /**
     * Sets the value of the cntrPndgCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CopyStatusXsys02500101 setCntrPndgCp(BigDecimal value) {
        this.cntrPndgCp = value;
        return this;
    }

    /**
     * Gets the value of the cntrCpdPndgAuth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCntrCpdPndgAuth() {
        return cntrCpdPndgAuth;
    }

    /**
     * Sets the value of the cntrCpdPndgAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CopyStatusXsys02500101 setCntrCpdPndgAuth(BigDecimal value) {
        this.cntrCpdPndgAuth = value;
        return this;
    }

    /**
     * Gets the value of the msgList property.
     * 
     * @return
     *     possible object is
     *     {@link MessageListXsys02500101 }
     *     
     */
    public MessageListXsys02500101 getMsgList() {
        return msgList;
    }

    /**
     * Sets the value of the msgList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageListXsys02500101 }
     *     
     */
    public CopyStatusXsys02500101 setMsgList(MessageListXsys02500101 value) {
        this.msgList = value;
        return this;
    }

    /**
     * Gets the value of the refList property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceList }
     *     
     */
    public ReferenceList getRefList() {
        return refList;
    }

    /**
     * Sets the value of the refList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceList }
     *     
     */
    public CopyStatusXsys02500101 setRefList(ReferenceList value) {
        this.refList = value;
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
     * Java class for anonymous complex type.
     * 
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "frTm",
        "toTm"
    })
    public static class TmRg {

        @XmlElement(name = "FrTm", required = true, type = String.class)
        @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar frTm;
        @XmlElement(name = "ToTm", required = true, type = String.class)
        @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar toTm;

        /**
         * Gets the value of the frTm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public XMLGregorianCalendar getFrTm() {
            return frTm;
        }

        /**
         * Sets the value of the frTm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public CopyStatusXsys02500101 .TmRg setFrTm(XMLGregorianCalendar value) {
            this.frTm = value;
            return this;
        }

        /**
         * Gets the value of the toTm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public XMLGregorianCalendar getToTm() {
            return toTm;
        }

        /**
         * Sets the value of the toTm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public CopyStatusXsys02500101 .TmRg setToTm(XMLGregorianCalendar value) {
            this.toTm = value;
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

}
