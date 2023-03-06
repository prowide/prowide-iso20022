
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
 * Class for auth.025.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ccyCtrlSpprtgDocDlvry"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.025.001.02")
public class MxAuth02500102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CcyCtrlSpprtgDocDlvry", required = true)
    protected CurrencyControlSupportingDocumentDeliveryV02 ccyCtrlSpprtgDocDlvry;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 25;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, BinaryFile1 .class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact4 .class, ContractRegistrationReference1Choice.class, CurrencyControlHeader5 .class, CurrencyControlSupportingDocumentDeliveryV02 .class, DateAndPlaceOfBirth1 .class, DocumentAmendment1 .class, DocumentGeneralInformation3 .class, DocumentIdentification22 .class, DocumentIdentification28 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MxAuth02500102 .class, NamePrefix2Code.class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, Party38Choice.class, Party40Choice.class, PartyIdentification135 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, ShipmentAttribute1 .class, SignatureEnvelopeReference.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SupportingDocument2 .class, SupportingDocumentEntry1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.025.001.02";

    public MxAuth02500102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth02500102(final String xml) {
        this();
        MxAuth02500102 tmp = parse(xml);
        ccyCtrlSpprtgDocDlvry = tmp.getCcyCtrlSpprtgDocDlvry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth02500102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ccyCtrlSpprtgDocDlvry property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyControlSupportingDocumentDeliveryV02 }
     *     
     */
    public CurrencyControlSupportingDocumentDeliveryV02 getCcyCtrlSpprtgDocDlvry() {
        return ccyCtrlSpprtgDocDlvry;
    }

    /**
     * Sets the value of the ccyCtrlSpprtgDocDlvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyControlSupportingDocumentDeliveryV02 }
     *     
     */
    public MxAuth02500102 setCcyCtrlSpprtgDocDlvry(CurrencyControlSupportingDocumentDeliveryV02 value) {
        this.ccyCtrlSpprtgDocDlvry = value;
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
    public static MxAuth02500102 parse(String xml) {
        return ((MxAuth02500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth02500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth02500102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth02500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth02500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth02500102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth02500102) parserImpl.read(MxAuth02500102 .class, xml, _classes));
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
     * Creates an MxAuth02500102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth02500102 message
     * @return
     *     a new instance of MxAuth02500102
     */
    public final static MxAuth02500102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth02500102 .class);
    }

}
