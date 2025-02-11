
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Method of voting participation to a general meeting.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipationMethod2", propOrder = {
    "prtcptnMtd",
    "issrDdlnForVtng",
    "spprtdByAcctSvcr",
    "rspnDdlnForVtng"
})
public class ParticipationMethod2 {

    @XmlElement(name = "PrtcptnMtd", required = true)
    protected ParticipationMethod3Choice prtcptnMtd;
    @XmlElement(name = "IssrDdlnForVtng", required = true)
    protected DateFormat58Choice issrDdlnForVtng;
    @XmlElement(name = "SpprtdByAcctSvcr")
    protected Boolean spprtdByAcctSvcr;
    @XmlElement(name = "RspnDdlnForVtng")
    protected DateFormat58Choice rspnDdlnForVtng;

    /**
     * Gets the value of the prtcptnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipationMethod3Choice }
     *     
     */
    public ParticipationMethod3Choice getPrtcptnMtd() {
        return prtcptnMtd;
    }

    /**
     * Sets the value of the prtcptnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationMethod3Choice }
     *     
     */
    public ParticipationMethod2 setPrtcptnMtd(ParticipationMethod3Choice value) {
        this.prtcptnMtd = value;
        return this;
    }

    /**
     * Gets the value of the issrDdlnForVtng property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getIssrDdlnForVtng() {
        return issrDdlnForVtng;
    }

    /**
     * Sets the value of the issrDdlnForVtng property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public ParticipationMethod2 setIssrDdlnForVtng(DateFormat58Choice value) {
        this.issrDdlnForVtng = value;
        return this;
    }

    /**
     * Gets the value of the spprtdByAcctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpprtdByAcctSvcr() {
        return spprtdByAcctSvcr;
    }

    /**
     * Sets the value of the spprtdByAcctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ParticipationMethod2 setSpprtdByAcctSvcr(Boolean value) {
        this.spprtdByAcctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the rspnDdlnForVtng property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getRspnDdlnForVtng() {
        return rspnDdlnForVtng;
    }

    /**
     * Sets the value of the rspnDdlnForVtng property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public ParticipationMethod2 setRspnDdlnForVtng(DateFormat58Choice value) {
        this.rspnDdlnForVtng = value;
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
