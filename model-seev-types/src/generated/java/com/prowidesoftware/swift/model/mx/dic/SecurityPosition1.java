
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Net position of a segregated holding, in a single security, within the overall position held in a securities account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityPosition1", propOrder = {
    "id",
    "pos",
    "mtgAttndee",
    "prxy",
    "voteDtls",
    "prtcptnRegnReq",
    "blckgReq",
    "sctiesRegnReq",
    "sctySubPos"
})
public class SecurityPosition1 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification3 id;
    @XmlElement(name = "Pos")
    protected EligiblePosition pos;
    @XmlElement(name = "MtgAttndee")
    protected List<VotingPartyAndInstruction> mtgAttndee;
    @XmlElement(name = "Prxy")
    protected List<VotingPartyAndInstruction> prxy;
    @XmlElement(name = "VoteDtls")
    protected List<VoteInstruction> voteDtls;
    @XmlElement(name = "PrtcptnRegnReq")
    protected List<RequestInformation> prtcptnRegnReq;
    @XmlElement(name = "BlckgReq")
    protected List<RequestInformation> blckgReq;
    @XmlElement(name = "SctiesRegnReq")
    protected List<RequestInformation> sctiesRegnReq;
    @XmlElement(name = "SctySubPos")
    protected List<SecurityPosition2> sctySubPos;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification3 }
     *     
     */
    public SecurityIdentification3 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification3 }
     *     
     */
    public SecurityPosition1 setId(SecurityIdentification3 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link EligiblePosition }
     *     
     */
    public EligiblePosition getPos() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligiblePosition }
     *     
     */
    public SecurityPosition1 setPos(EligiblePosition value) {
        this.pos = value;
        return this;
    }

    /**
     * Gets the value of the mtgAttndee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mtgAttndee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMtgAttndee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VotingPartyAndInstruction }
     * 
     * 
     */
    public List<VotingPartyAndInstruction> getMtgAttndee() {
        if (mtgAttndee == null) {
            mtgAttndee = new ArrayList<VotingPartyAndInstruction>();
        }
        return this.mtgAttndee;
    }

    /**
     * Gets the value of the prxy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prxy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrxy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VotingPartyAndInstruction }
     * 
     * 
     */
    public List<VotingPartyAndInstruction> getPrxy() {
        if (prxy == null) {
            prxy = new ArrayList<VotingPartyAndInstruction>();
        }
        return this.prxy;
    }

    /**
     * Gets the value of the voteDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voteDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoteDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoteInstruction }
     * 
     * 
     */
    public List<VoteInstruction> getVoteDtls() {
        if (voteDtls == null) {
            voteDtls = new ArrayList<VoteInstruction>();
        }
        return this.voteDtls;
    }

    /**
     * Gets the value of the prtcptnRegnReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtcptnRegnReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtcptnRegnReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestInformation }
     * 
     * 
     */
    public List<RequestInformation> getPrtcptnRegnReq() {
        if (prtcptnRegnReq == null) {
            prtcptnRegnReq = new ArrayList<RequestInformation>();
        }
        return this.prtcptnRegnReq;
    }

    /**
     * Gets the value of the blckgReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blckgReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlckgReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestInformation }
     * 
     * 
     */
    public List<RequestInformation> getBlckgReq() {
        if (blckgReq == null) {
            blckgReq = new ArrayList<RequestInformation>();
        }
        return this.blckgReq;
    }

    /**
     * Gets the value of the sctiesRegnReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesRegnReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesRegnReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestInformation }
     * 
     * 
     */
    public List<RequestInformation> getSctiesRegnReq() {
        if (sctiesRegnReq == null) {
            sctiesRegnReq = new ArrayList<RequestInformation>();
        }
        return this.sctiesRegnReq;
    }

    /**
     * Gets the value of the sctySubPos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctySubPos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctySubPos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityPosition2 }
     * 
     * 
     */
    public List<SecurityPosition2> getSctySubPos() {
        if (sctySubPos == null) {
            sctySubPos = new ArrayList<SecurityPosition2>();
        }
        return this.sctySubPos;
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
     * Adds a new item to the mtgAttndee list.
     * @see #getMtgAttndee()
     * 
     */
    public SecurityPosition1 addMtgAttndee(VotingPartyAndInstruction mtgAttndee) {
        getMtgAttndee().add(mtgAttndee);
        return this;
    }

    /**
     * Adds a new item to the prxy list.
     * @see #getPrxy()
     * 
     */
    public SecurityPosition1 addPrxy(VotingPartyAndInstruction prxy) {
        getPrxy().add(prxy);
        return this;
    }

    /**
     * Adds a new item to the voteDtls list.
     * @see #getVoteDtls()
     * 
     */
    public SecurityPosition1 addVoteDtls(VoteInstruction voteDtls) {
        getVoteDtls().add(voteDtls);
        return this;
    }

    /**
     * Adds a new item to the prtcptnRegnReq list.
     * @see #getPrtcptnRegnReq()
     * 
     */
    public SecurityPosition1 addPrtcptnRegnReq(RequestInformation prtcptnRegnReq) {
        getPrtcptnRegnReq().add(prtcptnRegnReq);
        return this;
    }

    /**
     * Adds a new item to the blckgReq list.
     * @see #getBlckgReq()
     * 
     */
    public SecurityPosition1 addBlckgReq(RequestInformation blckgReq) {
        getBlckgReq().add(blckgReq);
        return this;
    }

    /**
     * Adds a new item to the sctiesRegnReq list.
     * @see #getSctiesRegnReq()
     * 
     */
    public SecurityPosition1 addSctiesRegnReq(RequestInformation sctiesRegnReq) {
        getSctiesRegnReq().add(sctiesRegnReq);
        return this;
    }

    /**
     * Adds a new item to the sctySubPos list.
     * @see #getSctySubPos()
     * 
     */
    public SecurityPosition1 addSctySubPos(SecurityPosition2 sctySubPos) {
        getSctySubPos().add(sctySubPos);
        return this;
    }

}
