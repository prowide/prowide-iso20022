
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for acmt.005.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqForAcctMgmtStsRptV02"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:acmt.005.001.02")
public class MxAcmt00500102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ReqForAcctMgmtStsRptV02", required = true)
    protected RequestForAccountManagementStatusReportV02 reqForAcctMgmtStsRptV02;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1 .class, AccountManagementMessageReference1 .class, AccountManagementType1Code.class, AdditionalReference3 .class, AddressType2Code.class, GenderCode.class, GenericIdentification1 .class, GenericIdentification10 .class, IndividualPerson4 .class, IndividualPersonIdentificationChoice.class, InvestmentAccount14 .class, MessageIdentification1 .class, MxAcmt00500102 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PersonIdentificationType1Code.class, PostalAddress1 .class, RequestForAccountManagementStatusReportV02 .class, SimpleIdentificationInformation.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:acmt.005.001.02";

    public MxAcmt00500102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00500102(final String xml) {
        this();
        MxAcmt00500102 tmp = parse(xml);
        reqForAcctMgmtStsRptV02 = tmp.getReqForAcctMgmtStsRptV02();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00500102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reqForAcctMgmtStsRptV02 property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForAccountManagementStatusReportV02 }
     *     
     */
    public RequestForAccountManagementStatusReportV02 getReqForAcctMgmtStsRptV02() {
        return reqForAcctMgmtStsRptV02;
    }

    /**
     * Sets the value of the reqForAcctMgmtStsRptV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForAccountManagementStatusReportV02 }
     *     
     */
    public MxAcmt00500102 setReqForAcctMgmtStsRptV02(RequestForAccountManagementStatusReportV02 value) {
        this.reqForAcctMgmtStsRptV02 = value;
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
    public static MxAcmt00500102 parse(String xml) {
        return ((MxAcmt00500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt00500102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt00500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00500102 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00500102) parserImpl.read(MxAcmt00500102 .class, xml, _classes));
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
     * Creates an MxAcmt00500102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00500102 message
     * @return
     *     a new instance of MxAcmt00500102
     */
    public final static MxAcmt00500102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt00500102 .class);
    }

}
