
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
 * Class for tsin.005.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "udrtkgAppl"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01")
public class MxTsin00500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "UdrtkgAppl", required = true)
    protected UndertakingApplicationV01 udrtkgAppl;
    public final static transient String BUSINESS_PROCESS = "tsin";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AmountAndTrigger1 .class, AmountOrPercentage1Choice.class, AutoExtend1Choice.class, AutoExtension1 .class, AutomaticVariation1 .class, CashAccount28 .class, Channel1Choice.class, CommunicationChannel1 .class, CommunicationMethod1Choice.class, ContactDetails2 .class, CountrySubdivision1Choice.class, DateAndDateTimeChoice.class, DateAndPlaceOfBirth.class, DateInformation1 .class, Document10 .class, Document11 .class, Document9 .class, DocumentFormat1Choice.class, ExpiryDetails2 .class, ExpiryTerms2 .class, FixedOrRecurrentDate1Choice.class, GenericAccountIdentification1 .class, GenericIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GovernanceIdentification1Choice.class, GovernanceIdentification1Code.class, GovernanceRules1 .class, Location1 .class, ModelFormIdentification1 .class, ModelFormIdentification1Choice.class, MxTsin00500101 .class, NamePrefix1Code.class, Narrative1 .class, NarrativeType1Choice.class, NonExtension1 .class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party11Choice.class, PartyAndSignature2 .class, PartyAndType1 .class, PartyIdentification43 .class, PartyType1Choice.class, Percentage1 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, Presentation3 .class, Presentation4 .class, PresentationDocumentFormat1Choice.class, PresentationMedium1Choice.class, PresentationMedium1Code.class, ProprietaryData3 .class, Trigger1 .class, UnderlyingTradeTransaction1 .class, UnderlyingTradeTransactionType1Choice.class, Undertaking1 .class, Undertaking2 .class, UndertakingAmount1 .class, UndertakingAmount4 .class, UndertakingApplicationV01 .class, UndertakingDocumentType1Choice.class, UndertakingDocumentType2Choice.class, UndertakingName1Code.class, UndertakingType1Choice.class, UndertakingWording1 .class, VariationType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01";

    public MxTsin00500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsin00500101(final String xml) {
        this();
        MxTsin00500101 tmp = parse(xml);
        udrtkgAppl = tmp.getUdrtkgAppl();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsin00500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the udrtkgAppl property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingApplicationV01 }
     *     
     */
    public UndertakingApplicationV01 getUdrtkgAppl() {
        return udrtkgAppl;
    }

    /**
     * Sets the value of the udrtkgAppl property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingApplicationV01 }
     *     
     */
    public MxTsin00500101 setUdrtkgAppl(UndertakingApplicationV01 value) {
        this.udrtkgAppl = value;
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
    public static MxTsin00500101 parse(String xml) {
        return ((MxTsin00500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsin00500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsin00500101 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsin00500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsin00500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsin00500101 parse(String xml, MxRead parserImpl) {
        return ((MxTsin00500101) parserImpl.read(MxTsin00500101 .class, xml, _classes));
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
     * Creates an MxTsin00500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsin00500101 message
     * @return
     *     a new instance of MxTsin00500101
     */
    public final static MxTsin00500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsin00500101 .class);
    }

}
