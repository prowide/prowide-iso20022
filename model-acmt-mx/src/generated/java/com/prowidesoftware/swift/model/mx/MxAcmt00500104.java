
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for acmt.005.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqForAcctMgmtStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:acmt.005.001.04")
public class MxAcmt00500104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ReqForAcctMgmtStsRpt", required = true)
    protected RequestForAccountManagementStatusReportV04 reqForAcctMgmtStsRpt;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountManagementMessageReference3 .class, AccountManagementType1Code.class, AdditionalReference6 .class, AddressType2Code.class, GenderCode.class, GenericIdentification1 .class, GenericIdentification47 .class, GenericIdentification81 .class, IndividualPerson30 .class, IndividualPersonIdentification2Choice.class, InvestmentAccount53 .class, LinkedMessage3Choice.class, MessageIdentification1 .class, MxAcmt00500104 .class, NameAndAddress5 .class, OtherIdentification3Choice.class, OwnerIdentification2Choice.class, PartyIdentification70Choice.class, PartyIdentification90Choice.class, PartyIdentification95 .class, PartyIdentificationType7Code.class, PostalAddress1 .class, RequestForAccountManagementStatusReportV04 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:acmt.005.001.04";

    public MxAcmt00500104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00500104(final String xml) {
        this();
        MxAcmt00500104 tmp = parse(xml);
        reqForAcctMgmtStsRpt = tmp.getReqForAcctMgmtStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00500104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reqForAcctMgmtStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForAccountManagementStatusReportV04 }
     *     
     */
    public RequestForAccountManagementStatusReportV04 getReqForAcctMgmtStsRpt() {
        return reqForAcctMgmtStsRpt;
    }

    /**
     * Sets the value of the reqForAcctMgmtStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForAccountManagementStatusReportV04 }
     *     
     */
    public MxAcmt00500104 setReqForAcctMgmtStsRpt(RequestForAccountManagementStatusReportV04 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxAcmt00500104 parse(String xml) {
        return ((MxAcmt00500104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00500104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt00500104 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt00500104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00500104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00500104 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00500104) parserImpl.read(MxAcmt00500104 .class, xml, _classes));
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
     * Creates an MxAcmt00500104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00500104 message
     * @return
     *     a new instance of MxAcmt00500104
     */
    public final static MxAcmt00500104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt00500104 .class);
    }

}
