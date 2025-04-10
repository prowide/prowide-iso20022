
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for auth.020.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ctrctRegnClsrReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.020.001.04")
public class MxAuth02000104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CtrctRegnClsrReq", required = true)
    protected ContractRegistrationClosureRequestV04 ctrctRegnClsrReq;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 20;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, AddressType3Choice.class, BinaryFile1 .class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact13 .class, ContractCessionData2 .class, ContractClosureReason1Choice.class, ContractRegistrationClosureRequestV04 .class, CurrencyControlHeader8 .class, DateAndPlaceOfBirth1 .class, DocumentGeneralInformation5 .class, DocumentIdentification29 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, LegalOrganisation2 .class, MxAuth02000104 .class, NamePrefix2Code.class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, Party52Choice.class, PartyIdentification272 .class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress27 .class, PreferredContactMethod2Code.class, Priority2Code.class, RegisteredContract19 .class, SignatureEnvelopeReference.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxExemptionReasonFormat1Choice.class, TaxParty4 .class, TradeParty6 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.020.001.04";

    public MxAuth02000104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth02000104(final String xml) {
        this();
        MxAuth02000104 tmp = parse(xml);
        ctrctRegnClsrReq = tmp.getCtrctRegnClsrReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth02000104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ctrctRegnClsrReq property.
     * 
     * @return
     *     possible object is
     *     {@link ContractRegistrationClosureRequestV04 }
     *     
     */
    public ContractRegistrationClosureRequestV04 getCtrctRegnClsrReq() {
        return ctrctRegnClsrReq;
    }

    /**
     * Sets the value of the ctrctRegnClsrReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractRegistrationClosureRequestV04 }
     *     
     */
    public MxAuth02000104 setCtrctRegnClsrReq(ContractRegistrationClosureRequestV04 value) {
        this.ctrctRegnClsrReq = value;
        return this;
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
    public static MxAuth02000104 parse(String xml) {
        return ((MxAuth02000104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth02000104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth02000104 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth02000104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth02000104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth02000104 parse(String xml, MxRead parserImpl) {
        return ((MxAuth02000104) parserImpl.read(MxAuth02000104 .class, xml, _classes));
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
     * Creates an MxAuth02000104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth02000104 message
     * @return
     *     a new instance of MxAuth02000104
     */
    public static final MxAuth02000104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth02000104 .class);
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
