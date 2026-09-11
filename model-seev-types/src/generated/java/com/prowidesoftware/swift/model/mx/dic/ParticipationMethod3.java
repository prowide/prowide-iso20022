
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "ParticipationMethod3", propOrder = {
    "prtcptnMtd",
    "attndeeEmailReqrdInd",
    "issrDdlnForVtng",
    "spprtdByAcctSvcr",
    "rspnDdlnForVtng",
    "invstrTpId"
})
public class ParticipationMethod3 {

    @XmlElement(name = "PrtcptnMtd", required = true)
    protected ParticipationMethod3Choice prtcptnMtd;
    @XmlElement(name = "AttndeeEmailReqrdInd")
    protected Boolean attndeeEmailReqrdInd;
    @XmlElement(name = "IssrDdlnForVtng", required = true)
    protected DateFormat58Choice issrDdlnForVtng;
    @XmlElement(name = "SpprtdByAcctSvcr")
    protected Boolean spprtdByAcctSvcr;
    @XmlElement(name = "RspnDdlnForVtng")
    protected DateFormat58Choice rspnDdlnForVtng;
    @XmlElement(name = "InvstrTpId")
    protected List<InvestorTypeIdentification1> invstrTpId;

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
    public ParticipationMethod3 setPrtcptnMtd(ParticipationMethod3Choice value) {
        this.prtcptnMtd = value;
        return this;
    }

    /**
     * Gets the value of the attndeeEmailReqrdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttndeeEmailReqrdInd() {
        return attndeeEmailReqrdInd;
    }

    /**
     * Sets the value of the attndeeEmailReqrdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ParticipationMethod3 setAttndeeEmailReqrdInd(Boolean value) {
        this.attndeeEmailReqrdInd = value;
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
    public ParticipationMethod3 setIssrDdlnForVtng(DateFormat58Choice value) {
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
    public ParticipationMethod3 setSpprtdByAcctSvcr(Boolean value) {
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
    public ParticipationMethod3 setRspnDdlnForVtng(DateFormat58Choice value) {
        this.rspnDdlnForVtng = value;
        return this;
    }

    /**
     * Gets the value of the invstrTpId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the invstrTpId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstrTpId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestorTypeIdentification1 }
     * 
     * 
     * @return
     *     The value of the invstrTpId property.
     */
    public List<InvestorTypeIdentification1> getInvstrTpId() {
        if (invstrTpId == null) {
            invstrTpId = new ArrayList<>();
        }
        return this.invstrTpId;
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
     * Adds a new item to the invstrTpId list.
     * @see #getInvstrTpId()
     * 
     */
    public ParticipationMethod3 addInvstrTpId(InvestorTypeIdentification1 invstrTpId) {
        getInvstrTpId().add(invstrTpId);
        return this;
    }

}
