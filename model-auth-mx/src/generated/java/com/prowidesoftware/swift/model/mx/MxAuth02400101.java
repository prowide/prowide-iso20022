
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
 * Class for auth.024.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pmtRgltryInfNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.024.001.01")
public class MxAuth02400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PmtRgltryInfNtfctn", required = true)
    protected PaymentRegulatoryInformationNotificationV01 pmtRgltryInfNtfctn;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 24;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, BinaryFile1 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount24 .class, CashAccountType2Choice.class, CertificateIdentification1 .class, CertificateReference1 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, ContractRegistrationReference1Choice.class, CurrencyControlHeader3 .class, DateAndPlaceOfBirth.class, DocumentAmendment1 .class, DocumentGeneralInformation3 .class, DocumentIdentification28 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MxAuth02400101 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party11Choice.class, Party28Choice.class, PartyIdentification77 .class, PaymentRegulatoryInformationNotificationV01 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress19 .class, PostalAddress6 .class, ProprietaryReference1 .class, RegulatoryReportingNotification1 .class, SignatureEnvelopeReference.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionCertificate1 .class, TransactionCertificate2 .class, TransactionCertificateContract1 .class, TransactionCertificateRecord1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.024.001.01";

    public MxAuth02400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth02400101(final String xml) {
        this();
        MxAuth02400101 tmp = parse(xml);
        pmtRgltryInfNtfctn = tmp.getPmtRgltryInfNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth02400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the pmtRgltryInfNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRegulatoryInformationNotificationV01 }
     *     
     */
    public PaymentRegulatoryInformationNotificationV01 getPmtRgltryInfNtfctn() {
        return pmtRgltryInfNtfctn;
    }

    /**
     * Sets the value of the pmtRgltryInfNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRegulatoryInformationNotificationV01 }
     *     
     */
    public MxAuth02400101 setPmtRgltryInfNtfctn(PaymentRegulatoryInformationNotificationV01 value) {
        this.pmtRgltryInfNtfctn = value;
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
    public static MxAuth02400101 parse(String xml) {
        return ((MxAuth02400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth02400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth02400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth02400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth02400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth02400101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth02400101) parserImpl.read(MxAuth02400101 .class, xml, _classes));
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
     * Creates an MxAuth02400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth02400101 message
     * @return
     *     a new instance of MxAuth02400101
     */
    public final static MxAuth02400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth02400101 .class);
    }

}
