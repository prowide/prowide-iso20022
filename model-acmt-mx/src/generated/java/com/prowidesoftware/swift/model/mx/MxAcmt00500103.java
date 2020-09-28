
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for acmt.005.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqForAcctMgmtStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:acmt.005.001.03")
public class MxAcmt00500103
    extends AbstractMX
{

    @XmlElement(name = "ReqForAcctMgmtStsRpt", required = true)
    protected RequestForAccountManagementStatusReportV03 reqForAcctMgmtStsRpt;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1 .class, AccountManagementMessageReference2 .class, AccountManagementType1Code.class, AdditionalReference3 .class, AddressType2Code.class, GenderCode.class, GenericIdentification1 .class, GenericIdentification10 .class, IndividualPerson4 .class, IndividualPersonIdentificationChoice.class, InvestmentAccount45 .class, LinkedMessage2Choice.class, MessageIdentification1 .class, MxAcmt00500103 .class, NameAndAddress5 .class, OwnerIdentification1Choice.class, PartyIdentification2Choice.class, PartyIdentification5Choice.class, PersonIdentificationType1Code.class, PostalAddress1 .class, RequestForAccountManagementStatusReportV03 .class, SimpleIdentificationInformation.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:acmt.005.001.03";

    public MxAcmt00500103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00500103(final String xml) {
        this();
        MxAcmt00500103 tmp = parse(xml);
        reqForAcctMgmtStsRpt = tmp.getReqForAcctMgmtStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00500103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reqForAcctMgmtStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForAccountManagementStatusReportV03 }
     *     
     */
    public RequestForAccountManagementStatusReportV03 getReqForAcctMgmtStsRpt() {
        return reqForAcctMgmtStsRpt;
    }

    /**
     * Sets the value of the reqForAcctMgmtStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForAccountManagementStatusReportV03 }
     *     
     */
    public MxAcmt00500103 setReqForAcctMgmtStsRpt(RequestForAccountManagementStatusReportV03 value) {
        this.reqForAcctMgmtStsRpt = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxAcmt00500103 parse(String xml) {
        return ((MxAcmt00500103) MxReadImpl.parse(MxAcmt00500103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00500103 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00500103) parserImpl.read(MxAcmt00500103 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxAcmt00500103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00500103 message
     * @return
     *     a new instance of MxAcmt00500103
     */
    public final static MxAcmt00500103 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAcmt00500103 .class);
    }

}
