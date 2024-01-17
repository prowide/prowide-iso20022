
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for FileStatusDetails complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileStatusDetails", propOrder = {
    "swiftTime",
    "userDN",
    "transferDescription",
    "transferInfo",
    "fileDescription",
    "fileInfo",
    "digest",
    "possibleDuplicate",
    "origTransferRef",
    "snFOutputInfo",
    "signIndicator",
    "signDN",
    "signatureValue",
    "authorisationSignatureValue",
    "nrIndicator",
    "nonRep",
    "ackServerInfo",
    "notifQueue",
    "deliveryStatus",
    "deliveryTime",
    "ackDescription",
    "ackInfo",
    "copyIndicator",
    "authNotifInd",
    "headerInfoInd",
    "authorisationStatus",
    "thirdPartyInfoInd",
    "copyType",
    "copyState",
    "thirdPartyDN"
})
public class SwFileStatusDetails {

    @XmlElement(name = "SwiftTime")
    protected String swiftTime;
    @XmlElement(name = "UserDN", namespace = "urn:swift:snl:ns.SwSec")
    protected String userDN;
    @XmlElement(name = "TransferDescription")
    protected String transferDescription;
    @XmlElement(name = "TransferInfo")
    protected String transferInfo;
    @XmlElement(name = "FileDescription")
    protected String fileDescription;
    @XmlElement(name = "FileInfo")
    protected String fileInfo;
    @XmlElement(name = "Digest")
    protected SwDigest digest;
    @XmlElement(name = "PossibleDuplicate", required = true)
    protected String possibleDuplicate;
    @XmlElement(name = "OrigTransferRef")
    protected String origTransferRef;
    @XmlElement(name = "SnFOutputInfo")
    protected SwSnFOutputInfo snFOutputInfo;
    @XmlElement(name = "SignIndicator")
    protected String signIndicator;
    @XmlElement(name = "SignDN", namespace = "urn:swift:snl:ns.SwSec")
    protected String signDN;
    @XmlElement(name = "SignatureValue", namespace = "urn:swift:snl:ns.SwSec")
    protected String signatureValue;
    @XmlElement(name = "AuthorisationSignatureValue", namespace = "urn:swift:snl:ns.SwSec")
    protected String authorisationSignatureValue;
    @XmlElement(name = "NRIndicator", namespace = "urn:swift:snl:ns.SwInt")
    protected String nrIndicator;
    @XmlElement(name = "NonRep", namespace = "urn:swift:snl:ns.SwInt")
    protected SwIntNonRep nonRep;
    @XmlElement(name = "AckServerInfo")
    protected SwServerInfo ackServerInfo;
    @XmlElement(name = "NotifQueue", namespace = "urn:swift:snl:ns.SwInt")
    protected String notifQueue;
    @XmlElement(name = "DeliveryStatus")
    protected String deliveryStatus;
    @XmlElement(name = "DeliveryTime")
    protected String deliveryTime;
    @XmlElement(name = "AckDescription")
    protected String ackDescription;
    @XmlElement(name = "AckInfo")
    protected String ackInfo;
    @XmlElement(name = "CopyIndicator")
    protected String copyIndicator;
    @XmlElement(name = "AuthNotifInd")
    protected String authNotifInd;
    @XmlElement(name = "HeaderInfoInd")
    protected String headerInfoInd;
    @XmlElement(name = "AuthorisationStatus")
    protected String authorisationStatus;
    @XmlElement(name = "ThirdPartyInfoInd")
    protected String thirdPartyInfoInd;
    @XmlElement(name = "CopyType")
    protected String copyType;
    @XmlElement(name = "CopyState")
    protected String copyState;
    @XmlElement(name = "ThirdPartyDN")
    protected String thirdPartyDN;

    /**
     * Gets the value of the swiftTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiftTime() {
        return swiftTime;
    }

    /**
     * Sets the value of the swiftTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setSwiftTime(String value) {
        this.swiftTime = value;
        return this;
    }

    /**
     * Gets the value of the userDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDN() {
        return userDN;
    }

    /**
     * Sets the value of the userDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setUserDN(String value) {
        this.userDN = value;
        return this;
    }

    /**
     * Gets the value of the transferDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferDescription() {
        return transferDescription;
    }

    /**
     * Sets the value of the transferDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setTransferDescription(String value) {
        this.transferDescription = value;
        return this;
    }

    /**
     * Gets the value of the transferInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferInfo() {
        return transferInfo;
    }

    /**
     * Sets the value of the transferInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setTransferInfo(String value) {
        this.transferInfo = value;
        return this;
    }

    /**
     * Gets the value of the fileDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileDescription() {
        return fileDescription;
    }

    /**
     * Sets the value of the fileDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setFileDescription(String value) {
        this.fileDescription = value;
        return this;
    }

    /**
     * Gets the value of the fileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileInfo() {
        return fileInfo;
    }

    /**
     * Sets the value of the fileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setFileInfo(String value) {
        this.fileInfo = value;
        return this;
    }

    /**
     * Gets the value of the digest property.
     * 
     * @return
     *     possible object is
     *     {@link SwDigest }
     *     
     */
    public SwDigest getDigest() {
        return digest;
    }

    /**
     * Sets the value of the digest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwDigest }
     *     
     */
    public SwFileStatusDetails setDigest(SwDigest value) {
        this.digest = value;
        return this;
    }

    /**
     * Gets the value of the possibleDuplicate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPossibleDuplicate() {
        return possibleDuplicate;
    }

    /**
     * Sets the value of the possibleDuplicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setPossibleDuplicate(String value) {
        this.possibleDuplicate = value;
        return this;
    }

    /**
     * Gets the value of the origTransferRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigTransferRef() {
        return origTransferRef;
    }

    /**
     * Sets the value of the origTransferRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setOrigTransferRef(String value) {
        this.origTransferRef = value;
        return this;
    }

    /**
     * Gets the value of the snFOutputInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SwSnFOutputInfo }
     *     
     */
    public SwSnFOutputInfo getSnFOutputInfo() {
        return snFOutputInfo;
    }

    /**
     * Sets the value of the snFOutputInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSnFOutputInfo }
     *     
     */
    public SwFileStatusDetails setSnFOutputInfo(SwSnFOutputInfo value) {
        this.snFOutputInfo = value;
        return this;
    }

    /**
     * Gets the value of the signIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignIndicator() {
        return signIndicator;
    }

    /**
     * Sets the value of the signIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setSignIndicator(String value) {
        this.signIndicator = value;
        return this;
    }

    /**
     * Gets the value of the signDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignDN() {
        return signDN;
    }

    /**
     * Sets the value of the signDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setSignDN(String value) {
        this.signDN = value;
        return this;
    }

    /**
     * Gets the value of the signatureValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureValue() {
        return signatureValue;
    }

    /**
     * Sets the value of the signatureValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setSignatureValue(String value) {
        this.signatureValue = value;
        return this;
    }

    /**
     * Gets the value of the authorisationSignatureValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorisationSignatureValue() {
        return authorisationSignatureValue;
    }

    /**
     * Sets the value of the authorisationSignatureValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setAuthorisationSignatureValue(String value) {
        this.authorisationSignatureValue = value;
        return this;
    }

    /**
     * Gets the value of the nrIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRIndicator() {
        return nrIndicator;
    }

    /**
     * Sets the value of the nrIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setNRIndicator(String value) {
        this.nrIndicator = value;
        return this;
    }

    /**
     * Gets the value of the nonRep property.
     * 
     * @return
     *     possible object is
     *     {@link SwIntNonRep }
     *     
     */
    public SwIntNonRep getNonRep() {
        return nonRep;
    }

    /**
     * Sets the value of the nonRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntNonRep }
     *     
     */
    public SwFileStatusDetails setNonRep(SwIntNonRep value) {
        this.nonRep = value;
        return this;
    }

    /**
     * Gets the value of the ackServerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SwServerInfo }
     *     
     */
    public SwServerInfo getAckServerInfo() {
        return ackServerInfo;
    }

    /**
     * Sets the value of the ackServerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwServerInfo }
     *     
     */
    public SwFileStatusDetails setAckServerInfo(SwServerInfo value) {
        this.ackServerInfo = value;
        return this;
    }

    /**
     * Gets the value of the notifQueue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifQueue() {
        return notifQueue;
    }

    /**
     * Sets the value of the notifQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setNotifQueue(String value) {
        this.notifQueue = value;
        return this;
    }

    /**
     * Gets the value of the deliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * Sets the value of the deliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setDeliveryStatus(String value) {
        this.deliveryStatus = value;
        return this;
    }

    /**
     * Gets the value of the deliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * Sets the value of the deliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setDeliveryTime(String value) {
        this.deliveryTime = value;
        return this;
    }

    /**
     * Gets the value of the ackDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckDescription() {
        return ackDescription;
    }

    /**
     * Sets the value of the ackDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setAckDescription(String value) {
        this.ackDescription = value;
        return this;
    }

    /**
     * Gets the value of the ackInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckInfo() {
        return ackInfo;
    }

    /**
     * Sets the value of the ackInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setAckInfo(String value) {
        this.ackInfo = value;
        return this;
    }

    /**
     * Gets the value of the copyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyIndicator() {
        return copyIndicator;
    }

    /**
     * Sets the value of the copyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setCopyIndicator(String value) {
        this.copyIndicator = value;
        return this;
    }

    /**
     * Gets the value of the authNotifInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthNotifInd() {
        return authNotifInd;
    }

    /**
     * Sets the value of the authNotifInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setAuthNotifInd(String value) {
        this.authNotifInd = value;
        return this;
    }

    /**
     * Gets the value of the headerInfoInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderInfoInd() {
        return headerInfoInd;
    }

    /**
     * Sets the value of the headerInfoInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setHeaderInfoInd(String value) {
        this.headerInfoInd = value;
        return this;
    }

    /**
     * Gets the value of the authorisationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorisationStatus() {
        return authorisationStatus;
    }

    /**
     * Sets the value of the authorisationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setAuthorisationStatus(String value) {
        this.authorisationStatus = value;
        return this;
    }

    /**
     * Gets the value of the thirdPartyInfoInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyInfoInd() {
        return thirdPartyInfoInd;
    }

    /**
     * Sets the value of the thirdPartyInfoInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setThirdPartyInfoInd(String value) {
        this.thirdPartyInfoInd = value;
        return this;
    }

    /**
     * Gets the value of the copyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyType() {
        return copyType;
    }

    /**
     * Sets the value of the copyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setCopyType(String value) {
        this.copyType = value;
        return this;
    }

    /**
     * Gets the value of the copyState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyState() {
        return copyState;
    }

    /**
     * Sets the value of the copyState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setCopyState(String value) {
        this.copyState = value;
        return this;
    }

    /**
     * Gets the value of the thirdPartyDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyDN() {
        return thirdPartyDN;
    }

    /**
     * Sets the value of the thirdPartyDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileStatusDetails setThirdPartyDN(String value) {
        this.thirdPartyDN = value;
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
